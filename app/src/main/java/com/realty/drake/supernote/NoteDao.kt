package com.realty.drake.supernote

import android.arch.persistence.room.*
import com.realty.drake.supernote.models.Note

@Dao
interface NoteDao {
    @Query("SELECT * FROM note where id = :id")
    fun getNote(id: String): String

    @Query("SELECT * FROM note")
    fun loadAllNotes(): List<Note>

    @Delete
    fun deleteNote(id: String)

    @Delete
    fun deleteAllNote()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addNote(note: Note)

    @Update
    fun updateNote(note: Note)

}