package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class notification_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification_page)

        val class1_not_back = findViewById<ImageButton>(R.id.class1_not_backbutton)
        class1_not_back.setOnClickListener{
            val intent = Intent(this,class1::class.java)
            startActivity(intent)
        }
    }
}