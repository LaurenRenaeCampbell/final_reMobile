package com.example.remobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import java.sql.Types.NULL

class currentTermCourse {

    var name : String = ""
    var term : String = ""
    var grade : Int = NULL
    var prof : String = ""
    var location : String = ""
    var weekly : String = ""
    var start_time : Int = NULL
    var end_time : Int = NULL
    var section : Int = NULL

    fun getHeader(): String {
        return "$name"
    }

    fun getCourseInfo(): String {
        return  "$name, " +
                "$term, " +
                "$section, " +
                "$weekly @ $start_time - $end_time, " +
                "$location, " +
                "$prof "
    }
}

class coursespage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coursespage)

        val courses_back = findViewById<ImageButton>(R.id.coursesbackbutton)
        courses_back.setOnClickListener{
            val intent = Intent(this,homepage_personal::class.java)
            startActivity(intent)
        }

        val announ_button = findViewById<Button>(R.id.announcements_button)
        announ_button.setOnClickListener{
            val intent = Intent(this,courses_announ_page::class.java)
            startActivity(intent)
        }

        val assign_button = findViewById<Button>(R.id.assign_button)
        assign_button.setOnClickListener{
            val intent = Intent(this,courses_assign_page::class.java)
            startActivity(intent)
        }

        val class1Button = findViewById<Button>(R.id.class1)
        class1Button.setOnClickListener {
            val intent = Intent(this, class1::class.java)
            startActivity(intent)
        }

       /* val class2Button = findViewById<Button>(R.id.class2)
        class2Button.setOnClickListener {
            val intent = Intent(this, class2::class.java)
            startActivity(intent)
        }

        val class3Button = findViewById<Button>(R.id.class3)
        class3Button.setOnClickListener {
            val intent = Intent(this, class3::class.java)
            startActivity(intent)
        }

        val class4Button = findViewById<Button>(R.id.class4)
        class4Button.setOnClickListener {
            val intent = Intent(this, class4::class.java)
            startActivity(intent)
        }*/

        val class1 = currentTermCourse()
        //val class2 = currentTermCourse()
        //val class3 = currentTermCourse()
        //val class4 = currentTermCourse()

        class1.name = "Operating Systems I"
        val class1_button: Button = findViewById(R.id.class1)
        class1_button.text = class1.name

        /*class2.name = "Programming Language Fundamentals"
        val class2_button: Button = findViewById(R.id.class2)
        class2_button.text = class2.name

        class3.name = "Introduction to Computer Networks"
        val class3_button: Button = findViewById(R.id.class3)
        class3_button.text = class3.name

        class4.name = "Senior Capstone"
        val class4_button: Button = findViewById(R.id.class4)
        class4_button.text = class4.name*/
    }
}