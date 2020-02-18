package com.keppnoteapp

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.common.api.Api
import com.google.android.gms.common.api.GoogleApiClient
import com.google.android.gms.fitness.Fitness
import com.google.android.gms.fitness.FitnessOptions
import com.google.android.gms.fitness.FitnessStatusCodes
import com.google.android.gms.fitness.data.DataSource
import com.google.android.gms.fitness.data.DataType
import com.google.android.gms.fitness.request.DataReadRequest
import com.google.android.gms.fitness.result.DataReadResponse
import com.keppnoteapp.Adapters.WordListAdapter
import com.keppnoteapp.RoomDatabase.Entity.Word
import com.keppnoteapp.ViewModel.WordViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.recyclerview_item.*
import java.util.*
import java.util.concurrent.TimeUnit


class MainActivity : AppCompatActivity(), SensorEventListener {

    private val newWordActivityRequestCode = 1
    private lateinit var wordViewModel: WordViewModel

    var adapter: WordListAdapter? = null

    var running=false
    var sensorManager:SensorManager?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        sensorManager=getSystemService(Context.SENSOR_SERVICE) as SensorManager


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        val adapter = WordListAdapter(this)
        this.adapter = adapter
        adapter.mainActivity = this
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)




        wordViewModel = ViewModelProvider(this).get(WordViewModel::class.java)
        setWordsObserver()


        plusIcon.setOnClickListener {
            val intent = Intent(this, AddNoteAcitivity::class.java)
            startActivityForResult(intent, newWordActivityRequestCode)
        }




        ItemTouchHelper(object : ItemTouchHelper.SimpleCallback(
            0, ItemTouchHelper.LEFT.or(
                ItemTouchHelper.RIGHT
            )
        ) {
            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {
                return false
            }


            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                var position = viewHolder.adapterPosition
                var word: Word
                word = adapter.getWordAtPosition(position)!!

                wordViewModel.delete((word))
                Toast.makeText(baseContext, "Note Deleted!", Toast.LENGTH_SHORT).show()
            }
        }
        ).attachToRecyclerView(recyclerView)

    }


    override fun onResume() {
        super.onResume()
        running=true
        var stepsSensor=sensorManager?.getDefaultSensor(Sensor.TYPE_STEP_COUNTER)

        if(stepsSensor==null){
            Toast.makeText(this,"No step Counter Sensor!", Toast.LENGTH_SHORT).show()
        } else{
            sensorManager?.registerListener(this,stepsSensor,SensorManager.SENSOR_DELAY_UI)
        }
    }

    override fun onPause() {
        super.onPause()
        running=false
        sensorManager?.unregisterListener(this)
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onSensorChanged(event: SensorEvent?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        if(running){
            stepsValue.setText(""+event!!.values[0])
        }
    }






    private fun setWordsObserver() {
        wordViewModel.allWords.observe(this, Observer { words ->
            // Update the cached copy of the words in the adapter.
            words?.let { adapter?.setWords(it) }
        })
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == newWordActivityRequestCode && resultCode == Activity.RESULT_OK) {

            val newNote = Word(
                data!!.getStringExtra(AddNoteAcitivity.EXTRA_TITLE_REPLY),
                data.getStringExtra(AddNoteAcitivity.EXTRA_NOTE_REPLY),
                data.getStringExtra(AddNoteAcitivity.EXTRA_DATE_REPLY),
                data.getIntExtra(AddNoteAcitivity.EXTRA_COLOR_REPLY, Color.parseColor("#ffffff"))
            )
            wordViewModel.insert(newNote)

            Toast.makeText(this, "Note saved!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(
                applicationContext,
                R.string.empty_not_saved,
                Toast.LENGTH_LONG
            ).show()
        }


        val updateNote = Word(
            data!!.getStringExtra(AddNoteAcitivity.EXTRA_TITLE_REPLY),
            data.getStringExtra(AddNoteAcitivity.EXTRA_NOTE_REPLY),
            data.getStringExtra(AddNoteAcitivity.EXTRA_DATE_REPLY),
            data.getIntExtra(AddNoteAcitivity.EXTRA_COLOR_REPLY, Color.parseColor("#ffffff"))
        )

        updateNote.id = data.getIntExtra(AddNoteAcitivity.EXTRA_ID, -1)
        wordViewModel.update(updateNote)

    }


    fun update(word: Word) {
        wordViewModel.update(word)
    }

}









