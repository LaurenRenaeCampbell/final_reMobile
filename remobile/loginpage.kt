package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class loginpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginpage)

        val backButton = findViewById<ImageButton>(R.id.loginbackbutton)
        backButton.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        val loginButton = findViewById<Button>(R.id.loginbutton2)
        loginButton.setOnClickListener{
            val intent = Intent(this,homepage_personal::class.java)
            startActivity(intent)
        }
    }
}