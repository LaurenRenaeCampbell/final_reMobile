package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class map_search : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map_search)

        val map_op_back = findViewById<ImageButton>(R.id.map_search_backbutton)
        map_op_back.setOnClickListener{
            val intent = Intent(this,mappage::class.java)
            startActivity(intent)
        }

        val map_op2_back = findViewById<Button>(R.id.map_search_exp)
        map_op2_back.setOnClickListener{
            val intent = Intent(this,mappage::class.java)
            startActivity(intent)
        }
    }
}