package com.realty.drake.supernote

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    internal var lvItems: ListView
    internal var etEditText: EditText
    private val REQUEST_CODE = 123
    private var mDbHelper: TodoDbHelper? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
