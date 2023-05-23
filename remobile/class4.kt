package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class class4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class4)

        val class4_back = findViewById<ImageButton>(R.id.class4backbutton)
        class4_back.setOnClickListener{
            val intent = Intent(this,coursespage::class.java)
            startActivity(intent)
        }
    }
}