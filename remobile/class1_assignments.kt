package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class class1_assignments : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class1_assignments)

        val class1_assign_back = findViewById<ImageButton>(R.id.class1_assign_backbutton)
        class1_assign_back.setOnClickListener{
            val intent = Intent(this,class1::class.java)
            startActivity(intent)
        }

        val class1_assigndet_button = findViewById<Button>(R.id.class1_assign1)
        class1_assigndet_button.setOnClickListener{
            val intent = Intent(this,assignment_details::class.java)
            startActivity(intent)
        }

    }
}