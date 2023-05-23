package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class glance_event : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_glance_event)

        val cal_glance_event_back = findViewById<ImageButton>(R.id.calendar_glance_event_backbutton)
        cal_glance_event_back.setOnClickListener{
            val intent = Intent(this,calendarpage::class.java)
            startActivity(intent)
        }
    }
}