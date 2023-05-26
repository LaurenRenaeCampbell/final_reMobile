package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class foodpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foodpage)

        val food_back = findViewById<ImageButton>(R.id.foodbackbutton)
        food_back.setOnClickListener{
            val intent = Intent(this,homepage_campus::class.java)
            startActivity(intent)
        }

        val foodcourt_but = findViewById<Button>(R.id.foodcourt_but)
        foodcourt_but.setOnClickListener{
            val intent = Intent(this,foodcourtinfo::class.java)
            startActivity(intent)
        }
    }
}
