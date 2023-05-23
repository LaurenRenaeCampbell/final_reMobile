package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class map_parking : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map_parking)

        val map_par_back = findViewById<ImageButton>(R.id.map_parking_backbutton)
        map_par_back.setOnClickListener{
            val intent = Intent(this,mappage::class.java)
            startActivity(intent)
        }

        val map_par2_back = findViewById<Button>(R.id.map_parking_exp)
        map_par2_back.setOnClickListener{
            val intent = Intent(this,mappage::class.java)
            startActivity(intent)
        }

        val map_search = findViewById<Button>(R.id.map_search)
        map_search.setOnClickListener{
            val intent = Intent(this,map_search::class.java)
            startActivity(intent)
        }

        val map_food = findViewById<Button>(R.id.map_food)
        map_food.setOnClickListener{
            val intent = Intent(this,map_food::class.java)
            startActivity(intent)
        }

        val map_lights = findViewById<Button>(R.id.map_lights)
        map_lights.setOnClickListener{
            val intent = Intent(this,map_lights::class.java)
            startActivity(intent)
        }
    }
}