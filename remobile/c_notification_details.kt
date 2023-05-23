package com.example.remobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class c_notification_details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cnotification_details)

        val c_notdetails_back = findViewById<android.widget.ImageButton>(R.id.c_notdetails_backbutton)
        c_notdetails_back.setOnClickListener{
            val intent = android.content.Intent(this, notifications_campus::class.java)
            startActivity(intent)
        }
    }
}