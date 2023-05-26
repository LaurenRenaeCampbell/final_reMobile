package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class foodshop_details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foodshop_details)

        val foodshop_back = findViewById<ImageButton>(R.id.foodshopbackbutton)
        foodshop_back.setOnClickListener{
            val intent = Intent(this,foodcourtinfo::class.java)
            startActivity(intent)
        }
    }
}
