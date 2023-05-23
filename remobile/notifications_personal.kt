package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class notifications_personal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifications_personal)

        val not_p_back = findViewById<ImageButton>(R.id.not_p_backbutton)
        not_p_back.setOnClickListener{
            val intent = Intent(this,homepage_personal::class.java)
            startActivity(intent)
        }

        val not_p = findViewById<Button>(R.id.p_not)
        not_p.setOnClickListener{
            val intent = Intent(this,p_notification_details::class.java)
            startActivity(intent)
        }
    }
}