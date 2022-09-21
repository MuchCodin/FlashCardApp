package com.example.flashcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val flashCardQuestion = findViewById<TextView>(R.id.textQuestion)
        val flashCardAnswer = findViewById<TextView>(R.id.textAnswer)

        flashCardAnswer.visibility = View.INVISIBLE

        flashCardQuestion.setOnClickListener{
            flashCardAnswer.visibility = View.VISIBLE
            flashCardQuestion.visibility = View.INVISIBLE
        }

        flashCardAnswer.setOnClickListener{
            flashCardAnswer.visibility = View.INVISIBLE
            flashCardQuestion.visibility = View.VISIBLE
        }
    }
}