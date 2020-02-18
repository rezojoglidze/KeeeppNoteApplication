package com.keppnoteapp.RoomDatabase.Entity


import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "word_table")
class Word(
    val title:String,
    val note:String,
    val date:String,
    val color: Int
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}

