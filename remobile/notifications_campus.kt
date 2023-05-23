package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class notifications_campus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifications_campus)

        val not_c_back = findViewById<ImageButton>(R.id.not_c_backbutton)
        not_c_back.setOnClickListener{
            val intent = Intent(this,homepage_campus::class.java)
            startActivity(intent)
        }

        val not_c = findViewById<Button>(R.id.c_not)
        not_c.setOnClickListener{
            val intent = Intent(this,c_notification_details::class.java)
            startActivity(intent)
        }
    }
}