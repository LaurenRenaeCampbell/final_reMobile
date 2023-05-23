package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class course_announ_details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course_announ_details)

        val course_announdetails_back = findViewById<ImageButton>(R.id.course_announdetails_backbutton)
        course_announdetails_back.setOnClickListener{
            val intent = Intent(this,courses_announ_page::class.java)
            startActivity(intent)
        }
    }
}