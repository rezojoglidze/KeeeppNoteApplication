package com.keppnoteapp.Adapters


import android.content.Context
import android.graphics.drawable.GradientDrawable
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.keppnoteapp.MainActivity
import com.keppnoteapp.R
import com.keppnoteapp.RoomDatabase.Entity.Word
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


class WordListAdapter(context: Context) : RecyclerView.Adapter<WordListAdapter.WordViewHolder>() {

    private var words = emptyList<Word>() // Cached copy of words
    var mainActivity: MainActivity? = null

    private var onItemClick: (() -> Unit)? = null

    //aq maqvs recyckeview_item
    inner class WordViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val before_Update_Background_Layout: LinearLayout = itemView.findViewById(R.id.before_Update_Background_Layout)

        val before_Update_Title: TextView = itemView.findViewById(R.id.before_Update_Title)
        val before_Update_Note: TextView = itemView.findViewById(R.id.before_Update_Note)
        val before_Update_Date: TextView = itemView.findViewById(R.id.before_Update_Date)



        val update_Note_Layout: LinearLayout = itemView.findViewById(R.id.update_Note_Layout)
        val updated_Title: EditText = itemView.findViewById(R.id.updated_Title)
        val updated_Note: EditText = itemView.findViewById(R.id.updated_Note)

        val updateSaveButton: Button = itemView.findViewById(R.id.updateSaveButton)

        lateinit var word: Word

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {

        val itemView: View =
            LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item, parent, false)
        return WordViewHolder(itemView)

        //val adapter = WordListAdapter()
    }


    @RequiresApi(Build.VERSION_CODES.O)
    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        //val current = words[position]//object id maqvs current-shi
        val currentNote: Word = words[position]

        holder.before_Update_Note.text = currentNote.note
        holder.before_Update_Title.text = currentNote.title//!!
        holder.before_Update_Date.text = currentNote.date


        val gd = GradientDrawable()
        // Specify the shape of drawable
        // Specify the shape of drawable
        gd.shape = GradientDrawable.RECTANGLE

        // Set the fill color of drawable
        // Set the fill color of drawable
        gd.setColor(currentNote.color) // make the background transparent

        // Create a 2 pixels width red colored border for drawable
        // Create a 2 pixels width red colored border for drawable
        gd.setStroke(2, currentNote.color) // border width and color

        // Make the border rounded
        // Make the border rounded
        gd.cornerRadius = 30.0f // border corner radius

        holder.before_Update_Background_Layout.background = gd



        holder.before_Update_Background_Layout.setOnClickListener() {
            holder.updated_Note.setText(holder.before_Update_Note.text.toString())
            holder.updated_Title.setText(holder.before_Update_Title.text.toString())
            holder.before_Update_Background_Layout.visibility = View.GONE
            holder.update_Note_Layout.visibility = View.VISIBLE

            holder.update_Note_Layout.background=holder.before_Update_Background_Layout.background
        }




        holder.updateSaveButton.setOnClickListener() {

            holder.before_Update_Background_Layout.visibility = View.VISIBLE
            holder.update_Note_Layout.visibility = View.GONE


//            val colorBackground=holder.update_Note_Layout.background
            val current = LocalDateTime.now()
            val formatter = DateTimeFormatter.ofPattern("HH:mm     dd MMM yyyy") //dd-MMM-yy"
            val formatted = current.format(formatter)

            val updateNote = Word(
                holder.updated_Title.text.toString(),
                holder.updated_Note.text.toString(),
                "updated : $formatted",
                currentNote.color
            )


            var position = holder.adapterPosition
            updateNote.id= words[position].id


            mainActivity?.update(updateNote)
          //notifyDataSetChanged()   recycleView-s shecvlisas idzaxebaa
        }





        holder.itemView.setOnClickListener {
            onItemClick?.invoke()//intents agdzravs
        }
    }


    internal fun setWords(words: List<Word>) {
        this.words = words
        notifyDataSetChanged()
    }

    fun getWordAtPosition(position: Int): Word? {
        //return mWords.get(position)
        return words.get(position)
    }

    fun setOnItemClickListener(clickCallBack: () -> Unit) {
        onItemClick = clickCallBack
    }

    override fun getItemCount() = words.size
}