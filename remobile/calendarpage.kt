package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class calendarpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendarpage)

        val calendar_back = findViewById<ImageButton>(R.id.calendarbackbutton)
        calendar_back.setOnClickListener{
            val intent = Intent(this,homepage_personal::class.java)
            startActivity(intent)
        }

        val calendar_aca = findViewById<Button>(R.id.academic_cal_button)
        calendar_aca.setOnClickListener{
            val intent = Intent(this,cal_academic::class.java)
            startActivity(intent)
        }

        val calendar_camp = findViewById<Button>(R.id.campus_cal_button)
        calendar_camp.setOnClickListener{
            val intent = Intent(this,cal_campus::class.java)
            startActivity(intent)
        }

        val calendar_personal = findViewById<Button>(R.id.personal_cal_button)
        calendar_personal.setOnClickListener{
            val intent = Intent(this,cal_personal::class.java)
            startActivity(intent)
        }

        val glance = findViewById<Button>(R.id.event1)
        glance.setOnClickListener{
            val intent = Intent(this,glance_event::class.java)
            startActivity(intent)
        }
    }
}