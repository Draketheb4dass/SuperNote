package com.realty.drake.supernote

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.realty.drake.supernote.models.Note

@Database(entities = arrayOf(Note::class), version = 1)
abstract class MyDatabase: RoomDatabase() {
    abstract fun NoteDao(): NoteDao

    companion object {
        private var INSTANCE: MyDatabase? = null
        fun getInstance(context: Context): MyDatabase? {
            if(INSTANCE == null){
                synchronized(MyDatabase::class){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            MyDatabase::class.java, "note.db")
                            .build()
                }
            }
            return INSTANCE
        }

        fun destroyInstance(){
            INSTANCE = null
        }
    }
}