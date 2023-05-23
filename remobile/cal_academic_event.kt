package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class cal_academic_event : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cal_academic_event)

        val cal_aca_event_back = findViewById<ImageButton>(R.id.calendar_aca_event_backbutton)
        cal_aca_event_back.setOnClickListener{
            val intent = Intent(this,cal_academic::class.java)
            startActivity(intent)
        }
    }
}