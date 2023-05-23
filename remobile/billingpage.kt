package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class billingpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_billingpage)

        val billing_back = findViewById<ImageButton>(R.id.billingbackbutton)
        billing_back.setOnClickListener{
            val intent = Intent(this,homepage_personal::class.java)
            startActivity(intent)
        }
    }
}