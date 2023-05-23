package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class cal_personal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cal_personal)

        val calendar_per_back = findViewById<ImageButton>(R.id.calendar_per_backbutton)
        calendar_per_back.setOnClickListener{
            val intent = Intent(this,calendarpage::class.java)
            startActivity(intent)
        }

        val calendar_per_event = findViewById<Button>(R.id.cal_per_event)
        calendar_per_event.setOnClickListener{
            val intent = Intent(this,cal_personal_event::class.java)
            startActivity(intent)
        }

        val calendar_per_event2 = findViewById<Button>(R.id.cal_per_event2)
        calendar_per_event2.setOnClickListener{
            val intent = Intent(this,cal_personal_event::class.java)
            startActivity(intent)
        }

        val calendar_per_event3 = findViewById<Button>(R.id.cal_per_event3)
        calendar_per_event3.setOnClickListener{
            val intent = Intent(this,cal_personal_event::class.java)
            startActivity(intent)
        }
    }
}