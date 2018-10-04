package com.realty.drake.supernote.models

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "note")
data class Note (
    @PrimaryKey(autoGenerate = true) val id: String,
    @ColumnInfo(name = "note_title") val noteTitle: String,
    val note: String
)
