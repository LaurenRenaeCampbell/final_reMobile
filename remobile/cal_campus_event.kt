package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class cal_campus_event : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cal_campus_event)

        val cal_camp_event_back = findViewById<ImageButton>(R.id.calendar_camp_event_backbutton)
        cal_camp_event_back.setOnClickListener{
            val intent = Intent(this,cal_campus::class.java)
            startActivity(intent)
        }
    }
}