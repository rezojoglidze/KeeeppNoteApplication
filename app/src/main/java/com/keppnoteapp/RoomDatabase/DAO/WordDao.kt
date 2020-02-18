package com.keppnoteapp.RoomDatabase.DAO


import androidx.lifecycle.LiveData
import androidx.room.*
import com.keppnoteapp.RoomDatabase.Entity.Word


@Dao
interface WordDao {
    @Query("SELECT * from word_table")   //if you want to get order by alphabet use it "ORDER BY word ASC")
    fun getAlphabetizedWords(): LiveData<List<Word>>

    //@Query("SELECT * FROM todoentity WHERE title LIKE :title")
   // fun findByTitle(title: String): LiveData<List<TodoEntity>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)//ერთი და იგივე წინადადებას არ ჩასვამს
    suspend fun insert(word: Word)

    @Update
    suspend fun update(word :Word)

    @Delete
    suspend fun delete(word :Word)

    @Query("DELETE FROM word_table")
    suspend fun deleteAll()
}