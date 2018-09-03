package com.realty.drake.supernote

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 *Created by drake on 9/3/18
 */
class EditItemActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_item)

       val textBody: String = intent.getStringExtra("textBody")

    }
}