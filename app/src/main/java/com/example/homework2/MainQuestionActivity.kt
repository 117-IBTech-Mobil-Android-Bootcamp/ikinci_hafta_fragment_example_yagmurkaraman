package com.example.homework2

import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.concurrent.fixedRateTimer

class MainQuestionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_word_test)

        // set card strings of test screen
        findViewById<TextView>(R.id.buttonCard).text = intent.getStringExtra("string")
        findViewById<TextView>(R.id.text_view1).text = intent.getStringArrayExtra("string")?.get(0)
        findViewById<TextView>(R.id.text_view2).text = intent.getStringArrayExtra("string")?.get(1)
        findViewById<TextView>(R.id.text_view3).text = intent.getStringArrayExtra("string")?.get(2)
        findViewById<TextView>(R.id.text_view4).text = intent.getStringArrayExtra("string")?.get(3)

        val progressTimeCircle = findViewById<ProgressBar>(R.id.progress_circle)
        val progressTimeKeeper = findViewById<TextView>(R.id.progress_time_keeper)

        progressTimeCircle.progress = 100

        var i: Int = 20
        val runnable = object : Runnable {
            override fun run() {
                Handler().postDelayed(this, 1000)
                i--
            }
        }

        Handler().post(runnable)
    }
}