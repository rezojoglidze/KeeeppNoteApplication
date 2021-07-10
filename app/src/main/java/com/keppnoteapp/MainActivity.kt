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
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.keppnoteapp.Adapters.WordListAdapter
import com.keppnoteapp.RoomDatabase.Entity.Word
import com.keppnoteapp.ViewModel.WordViewModel
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(){

    private val newWordActivityRequestCode = 1
    private lateinit var wordViewModel: WordViewModel

    var adapter: WordListAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

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

            var dada=(data.getFloatExtra(AddNoteAcitivity.EXTRA_STEP_COUNTER, Float.MAX_VALUE))
          //  stepsValue.setText(dada)
//            stepsValue.setText("Dadada :  $(data.getFloatExtra(AddNoteAcitivity.EXTRA_STEP_COUNTER))")
//
            Toast.makeText(this, "Note saved!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(
                applicationContext,
                R.string.empty_not_saved,
                Toast.LENGTH_LONG
            ).show()
        }
    }

    fun update(word: Word) {
        wordViewModel.update(word)
    }
}









