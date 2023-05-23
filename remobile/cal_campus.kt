package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class cal_campus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cal_campus)

        val calendar_camp_back = findViewById<ImageButton>(R.id.calendar_camp_backbutton)
        calendar_camp_back.setOnClickListener{
            val intent = Intent(this,calendarpage::class.java)
            startActivity(intent)
        }

        val calendar_camp_event = findViewById<Button>(R.id.cal_camp_event)
        calendar_camp_event.setOnClickListener{
            val intent = Intent(this,cal_campus_event::class.java)
            startActivity(intent)
        }

        val calendar_camp_event2 = findViewById<Button>(R.id.cal_camp_event2)
        calendar_camp_event2.setOnClickListener{
            val intent = Intent(this,cal_campus_event::class.java)
            startActivity(intent)
        }

        val calendar_camp_event3 = findViewById<Button>(R.id.cal_camp_event3)
        calendar_camp_event3.setOnClickListener{
            val intent = Intent(this,cal_campus_event::class.java)
            startActivity(intent)
        }
    }
}