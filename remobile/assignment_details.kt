package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class assignment_details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assignment_details)

        val class1_assigndetails_back = findViewById<ImageButton>(R.id.class1_assigndetails_backbutton)
        class1_assigndetails_back.setOnClickListener{
            val intent = Intent(this,class1_assignments::class.java)
            startActivity(intent)
        }
    }
}