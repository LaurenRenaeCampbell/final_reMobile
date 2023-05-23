package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class cal_academic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cal_academic)

        val calendar_aca_back = findViewById<ImageButton>(R.id.calendar_aca_backbutton)
        calendar_aca_back.setOnClickListener{
            val intent = Intent(this,calendarpage::class.java)
            startActivity(intent)
        }

        val calendar_aca_event = findViewById<Button>(R.id.cal_aca_event)
        calendar_aca_event.setOnClickListener{
            val intent = Intent(this,cal_academic_event::class.java)
            startActivity(intent)
        }

        val calendar_aca_event2 = findViewById<Button>(R.id.cal_aca_event2)
        calendar_aca_event2.setOnClickListener{
            val intent = Intent(this,cal_academic_event::class.java)
            startActivity(intent)
        }

        val calendar_aca_event3 = findViewById<Button>(R.id.cal_aca_event3)
        calendar_aca_event3.setOnClickListener{
            val intent = Intent(this,cal_academic_event::class.java)
            startActivity(intent)
        }
    }
}