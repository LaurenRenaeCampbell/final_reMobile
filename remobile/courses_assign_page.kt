package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class courses_assign_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses_assign_page)

        val course_assign_back = findViewById<ImageButton>(R.id.course_assign_backbutton)
        course_assign_back.setOnClickListener{
            val intent = Intent(this,coursespage::class.java)
            startActivity(intent)
        }

        val courses_assign_button = findViewById<Button>(R.id.courses_assign1)
        courses_assign_button.setOnClickListener {
            val intent = Intent(this, courses_assigndetails_page::class.java)
            startActivity(intent)
        }
    }
}