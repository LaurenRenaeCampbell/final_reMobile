package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class foodcourtinfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foodcourtinfo)

        val foodcourt_back = findViewById<ImageButton>(R.id.foodcourtbackbutton)
        foodcourt_back.setOnClickListener{
            val intent = Intent(this,foodpage::class.java)
            startActivity(intent)
        }

        val foodshop1 = findViewById<Button>(R.id.details_but)
        foodshop1.setOnClickListener{
            val intent = Intent(this,foodshop_details::class.java)
            startActivity(intent)
        }

        val foodshop2 = findViewById<Button>(R.id.details_but2)
        foodshop2.setOnClickListener{
            val intent = Intent(this,foodshop_details::class.java)
            startActivity(intent)
        }

        val foodshop3 = findViewById<Button>(R.id.details_but3)
        foodshop3.setOnClickListener{
            val intent = Intent(this,foodshop_details::class.java)
            startActivity(intent)
        }
    }
}
