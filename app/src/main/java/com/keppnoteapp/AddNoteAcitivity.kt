package com.keppnoteapp


import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.RadioGroup
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_add_note.*
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle


class AddNoteAcitivity : AppCompatActivity() {

    companion object {
        const val EXTRA_ID = "EXTRA_ID"
        const val EXTRA_TITLE_REPLY = "title.REPLY"
        const val EXTRA_NOTE_REPLY = "note.REPLY"
        const val EXTRA_DATE_REPLY = "date.REPLY"
        const val EXTRA_COLOR_REPLY = "color.REPLY"
    }


    private lateinit var noteEditText: EditText
    private lateinit var titleEditText: EditText


    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_note);
        noteEditText = findViewById(R.id.Get_Note_Text)
        titleEditText = findViewById(R.id.Get_Title_Text)
        //Action bar hide
        supportActionBar?.hide()

        val saveButton = findViewById<Button>(R.id.button_save)
        val radio = findViewById<RadioGroup>(R.id.radioGroup)
        val background = findViewById<LinearLayout>(R.id.background)

        //radio buttons click
        radio.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.red -> {
                    background.setBackgroundColor(Color.parseColor("#e6adbc"))
                }
                R.id.green -> {
                    background.setBackgroundColor(Color.parseColor("#BCEEC1"))
                }
                R.id.blue -> {
                    background.setBackgroundColor(Color.parseColor("#add8e6"))
                }
            }
        }


        //saveButton click
        saveButton.setOnClickListener {
            val replyIntent = Intent()
            if (TextUtils.isEmpty(noteEditText.text) && TextUtils.isEmpty(titleEditText.text)) {
                setResult(Activity.RESULT_CANCELED, replyIntent)
            } else {

                val color = (background.getBackground() as ColorDrawable?)?.color

                val replyIntent = Intent()
                val data = Intent().apply {
                    putExtra(EXTRA_TITLE_REPLY, Get_Title_Text.text.toString())
                    putExtra(EXTRA_NOTE_REPLY, Get_Note_Text.text.toString())
                    putExtra(EXTRA_DATE_REPLY, getEditedTimeTextView.text.toString())
                    putExtra(EXTRA_COLOR_REPLY, color)

                }

                setResult(Activity.RESULT_OK, data)
                finish()
            }
        }


        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("HH:mm     dd MMM yyyy") //dd-MMM-yy"
        val formatted = current.format(formatter)

        getEditedTimeTextView.setText("Edited : $formatted")


        backIcon.setOnClickListener() {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }


}