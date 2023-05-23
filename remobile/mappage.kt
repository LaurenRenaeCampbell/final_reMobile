package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class mappage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mappage)

        val map_back = findViewById<ImageButton>(R.id.mapbackbutton)
        map_back.setOnClickListener{
            val intent = Intent(this,homepage_campus::class.java)
            startActivity(intent)
        }

        val map_exp = findViewById<Button>(R.id.map1_exp)
        map_exp.setOnClickListener{
            val intent = Intent(this,map_options::class.java)
            startActivity(intent)
        }
    }
}