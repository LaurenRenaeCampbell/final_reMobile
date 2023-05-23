package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class courses_assigndetails_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses_assigndetails_page)

        val courses_assigndetails_back = findViewById<ImageButton>(R.id.courses_assigndetails_backbutton)
        courses_assigndetails_back.setOnClickListener{
            val intent = Intent(this,courses_assign_page::class.java)
            startActivity(intent)
        }
    }
}