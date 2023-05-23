package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class class3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class3)

        val class3_back = findViewById<ImageButton>(R.id.class3backbutton)
        class3_back.setOnClickListener{
            val intent = Intent(this,coursespage::class.java)
            startActivity(intent)
        }
    }
}