package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class transportationpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transportationpage)

        val trans_back = findViewById<ImageButton>(R.id.transbackbutton)
        trans_back.setOnClickListener{
            val intent = Intent(this,homepage_campus::class.java)
            startActivity(intent)
        }
    }
}