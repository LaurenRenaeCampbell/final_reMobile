package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class map_lights : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map_lights)

        val map_op_back = findViewById<ImageButton>(R.id.map_lights_backbutton)
        map_op_back.setOnClickListener{
            val intent = Intent(this,mappage::class.java)
            startActivity(intent)
        }

        val map_op2_back = findViewById<Button>(R.id.map_lights_exp)
        map_op2_back.setOnClickListener{
            val intent = Intent(this,mappage::class.java)
            startActivity(intent)
        }

        val map_search = findViewById<Button>(R.id.map_search)
        map_search.setOnClickListener{
            val intent = Intent(this,map_search::class.java)
            startActivity(intent)
        }

        val map_park = findViewById<Button>(R.id.map_parking)
        map_park.setOnClickListener{
            val intent = Intent(this,map_parking::class.java)
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