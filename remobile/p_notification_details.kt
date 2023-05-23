package com.example.remobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class p_notification_details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pnotification_details)

        val p_notdetails_back = findViewById<android.widget.ImageButton>(R.id.p_notdetails_backbutton)
        p_notdetails_back.setOnClickListener{
            val intent = android.content.Intent(this, notifications_personal::class.java)
            startActivity(intent)
        }
    }
}