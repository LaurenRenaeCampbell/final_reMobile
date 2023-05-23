package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class class1_info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class1_info)

        val class1_info_back = findViewById<ImageButton>(R.id.class1_info_backbutton)
        class1_info_back.setOnClickListener{
            val intent = Intent(this,class1::class.java)
            startActivity(intent)
        }


    }
}