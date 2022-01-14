package com.pineapple.create_tms_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class
WeeklyActivity : AppCompatActivity() {
    lateinit var weeklyButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weekly)
        weeklyButton = findViewById(R.id.weeklyButton)

        weeklyButton.setOnClickListener(){
            val intent = Intent(applicationContext,EditWeeklyActivity::class.java)//EditTaskActivity
            startActivity(intent)
        }

    }
}