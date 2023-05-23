package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class homepage_personal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage_personal)

        val campusButton = findViewById<Button>(R.id.campusbutton)
        campusButton.setOnClickListener {
            val intent = Intent(this, homepage_campus::class.java)
            startActivity(intent)
        }

        val notButtonPersonal = findViewById<ImageButton>(R.id.notification_personal)
        notButtonPersonal.setOnClickListener {
            val intent = Intent(this, notifications_personal::class.java)
            startActivity(intent)

        }

        val setButtonPersonal = findViewById<ImageButton>(R.id.settings_personal)
        setButtonPersonal.setOnClickListener {
            val intent = Intent(this, settings_personal::class.java)
            startActivity(intent)
        }

        val coursesButton = findViewById<Button>(R.id.coursesbutton)
        coursesButton.setOnClickListener {
            val intent = Intent(this, coursespage::class.java)
            startActivity(intent)
        }

        val calendarButton = findViewById<Button>(R.id.calbutton)
        calendarButton.setOnClickListener {
            val intent = Intent(this, calendarpage::class.java)
            startActivity(intent)
        }

        val billingButton = findViewById<Button>(R.id.billingbutton)
        billingButton.setOnClickListener {
            val intent = Intent(this, billingpage::class.java)
            startActivity(intent)
        }
    }
}