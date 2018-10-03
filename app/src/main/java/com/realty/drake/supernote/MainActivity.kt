package com.realty.drake.supernote

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    internal lateinit var lvNote: ListView
    internal var etEditText: EditText
    private var mDbHelper: TodoDbHelper? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
