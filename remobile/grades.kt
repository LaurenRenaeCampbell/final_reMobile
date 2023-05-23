package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class grades : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grades)

        val class1_grades_back = findViewById<ImageButton>(R.id.class1_grades_backbutton)
        class1_grades_back.setOnClickListener {
            val intent = Intent(this, class1::class.java)
            startActivity(intent)
        }
    }
}