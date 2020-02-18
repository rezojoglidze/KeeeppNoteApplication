package com.keppnoteapp.RoomDatabase


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.keppnoteapp.RoomDatabase.DAO.WordDao
import com.keppnoteapp.RoomDatabase.Entity.Word
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

//database contains all my DAOs as abstract methods.

@Database(entities = arrayOf(Word::class), version = 4, exportSchema = false)
abstract class WordRoomDatabase : RoomDatabase() {

    abstract fun wordDao(): WordDao

    private class WordDatabaseCallback(
        private val scope: CoroutineScope
    ) : RoomDatabase.Callback() {

        override fun onOpen(db: SupportSQLiteDatabase) {
            super.onOpen(db)
            INSTANCE?.let { database ->
                //Now we can start using the database instance to access our DAO object.
                scope.launch {
                    //                    var wordDao = database.wordDao()
//
//                        // Delete all content here.
//                        // wordDao.deleteAll()
//                        // Add sample words.
//                        var word = Word("title - redmed",
//                            "note - android developer",
//                            "12:06")
//                        wordDao.insert(word)
                }
            }
        }
    }


    companion object {
        @Volatile
        private var INSTANCE: WordRoomDatabase? = null

        fun getDatabase(
            context: Context,
            scope: CoroutineScope
        ): WordRoomDatabase {
            // if the INSTANCE is not null, then return it,
            // if it is, then create the database
            return INSTANCE
                ?: synchronized(this) {
                    //After defining the database we can get an instance in our activity using the Room.databaseBuilder() method.
                    val instance = Room.databaseBuilder(
                        context.applicationContext,
                        WordRoomDatabase::class.java,
                        "word_database"
                    )
                        .addCallback(
                            WordDatabaseCallback(
                                scope
                            )
                        ).fallbackToDestructiveMigration()//
                        .build()
                    INSTANCE = instance
                    // return instance
                    instance
                }
        }
    }
}