package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class courses_announ_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses_announ_page)

        val course_announ_back = findViewById<ImageButton>(R.id.course_announ_backbutton)
        course_announ_back.setOnClickListener{
            val intent = Intent(this,coursespage::class.java)
            startActivity(intent)
        }

        val announ_details = findViewById<Button>(R.id.course_announ)
        announ_details.setOnClickListener {
            val intent = Intent(this, course_announ_details::class.java)
            startActivity(intent)

        }
    }
}