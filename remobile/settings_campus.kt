package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class settings_campus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings_campus)

        val setting_c_back = findViewById<ImageButton>(R.id.setting_c_backbutton)
        setting_c_back.setOnClickListener{
            val intent = Intent(this,homepage_campus::class.java)
            startActivity(intent)
        }

        val c_logout = findViewById<Button>(R.id.c_logout)
        c_logout.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}