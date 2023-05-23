package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class homepage_campus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage_campus)

        val personalButton = findViewById<Button>(R.id.personalbutton)
        personalButton.setOnClickListener {
            val intent = Intent(this, homepage_personal::class.java)
            startActivity(intent)
        }

        val notButtonCampus = findViewById<ImageButton>(R.id.notification_campus)
        notButtonCampus.setOnClickListener {
            val intent = Intent(this, notifications_campus::class.java)
            startActivity(intent)

        }

        val setButtonCampus = findViewById<ImageButton>(R.id.settings_campus)
        setButtonCampus.setOnClickListener {
            val intent = Intent(this, settings_campus::class.java)
            startActivity(intent)
        }

        val mapButton = findViewById<Button>(R.id.mapbutton)
        mapButton.setOnClickListener {
            val intent = Intent(this, mappage::class.java)
            startActivity(intent)
        }

        val transportationButton = findViewById<Button>(R.id.transbutton)
        transportationButton.setOnClickListener {
            val intent = Intent(this, transportationpage::class.java)
            startActivity(intent)
        }

        val foodButton = findViewById<Button>(R.id.foodbutton)
        foodButton.setOnClickListener {
            val intent = Intent(this, foodpage::class.java)
            startActivity(intent)
        }
    }
}