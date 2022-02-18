package com.pineapple.create_tms_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class SplashActivity : AppCompatActivity() {
    lateinit var badminton_left:ImageView
    lateinit var badminton_right:ImageView
    lateinit var splashText:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        badminton_left = findViewById(R.id.badminton_left)
        badminton_right = findViewById(R.id.badminton_right)
        splashText = findViewById(R.id.splashText)

        val startTime:Long = 2000 //2秒

        val timer = object : CountDownTimer(startTime, 100){

            override fun onTick(limitTime:Long) {

                badminton_right.setImageResource(R.drawable.badminton_right)
                badminton_left.setImageResource(R.drawable.badminton_left)
                splashText.text ="CTEM"  //Create TMS more easilyの略だけどもうちょっといい名前考えよう
            }

            override fun onFinish() {
              val intent = Intent(applicationContext,TaskActivity::class.java)
                startActivity(intent)
            }

        }
        timer.start()
    }
}