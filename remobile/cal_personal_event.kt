package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class cal_personal_event : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cal_personal_event)

        val cal_per_event_back = findViewById<ImageButton>(R.id.calendar_per_event_backbutton)
        cal_per_event_back.setOnClickListener{
            val intent = Intent(this,cal_personal::class.java)
            startActivity(intent)
        }
    }
}