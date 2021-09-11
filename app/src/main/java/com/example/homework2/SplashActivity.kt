package com.example.homework2

import java.util.Timer
import java.util.TimerTask
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {

    private val WAIT_FOR_SPLASH : Long = 3 * 1000

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Timer().schedule(object : TimerTask() {
            override fun run() {
                startActivity<MainTestScreenActivity>{
                    Intent()
                }
                finish()
            }
        }, WAIT_FOR_SPLASH)
    }
    // extension function for start activity
    inline fun<reified T: AppCompatActivity> Context.startActivity(block: Intent.() -> Unit = {}){
        val intent  = Intent(this , T::class.java)
        startActivity(
            intent.also {
                block.invoke(it)
            }
        )
    }
}