package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.ImageButton

class class1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class1)

        val class1_back = findViewById<ImageButton>(R.id.class1backbutton)
        class1_back.setOnClickListener{
            val intent = Intent(this,coursespage::class.java)
            startActivity(intent)
        }

        val class1_info_button = findViewById<Button>(R.id.class1_info_button)
        class1_info_button.setOnClickListener{
            val intent = Intent(this,class1_info::class.java)
            startActivity(intent)
        }

        val class1_assign_button = findViewById<Button>(R.id.class1_assign_button)
        class1_assign_button.setOnClickListener{
            val intent = Intent(this,class1_assignments::class.java)
            startActivity(intent)
        }

        val class1_grades_button = findViewById<Button>(R.id.class1_grades_button)
        class1_grades_button.setOnClickListener{
            val intent = Intent(this,grades::class.java)
            startActivity(intent)
        }

        val class1_not_button = findViewById<Button>(R.id.class1_announ_button)
        class1_not_button.setOnClickListener{
            val intent = Intent(this,notification_page::class.java)
            startActivity(intent)
        }

        //val class1 = currentTermCourse()
        //val class1_header: TextView = findViewById(R.id.class1header)
        //class1_header.text = class1.name
    }
}