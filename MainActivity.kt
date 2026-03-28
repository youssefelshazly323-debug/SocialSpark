package com.example.socialspark

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input = findViewById<EditText>(R.id.timeInput)
        val result = findViewById<TextView>(R.id.suggestionDisplay)
        val sparkBtn = findViewById<Button>(R.id.btnGetSpark)
        val resetBtn = findViewById<Button>(R.id.btnReset)

        sparkBtn.setOnClickListener {
            when (input.text.toString().trim().lowercase()) {
                "morning" -> result.text = " Send a Good Morning message to a family member!"
                "mid-morning" -> result.text = "Message a colleague with a quick Thank You!"
                "afternoon" -> result.text = " Share a funny meme with a friend!"
                "afternoon snack time" -> result.text = " Send a Thinking of you message!"
                "dinner" -> result.text = " Call a friend or relative for 5 minutes!"
                "after dinner" -> result.text = "Leave a kind comment on a friend's post!"
                else -> result.text = "⚠ Try: Morning, Mid-Morning, Afternoon, Dinner, or After Dinner."
            }
        }

        resetBtn.setOnClickListener {
            input.text.clear()
            result.text = ""
        }
    }
}
