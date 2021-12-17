package com.pineapple.create_tms_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView

class MainActivity : AppCompatActivity() {
    lateinit var calendarView: CalendarView
    lateinit var finishButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calendarView = findViewById(R.id.calendarView)
        finishButton = findViewById(R.id.finishiButton)


        finishButton.setOnClickListener(){
            finish()
        }

    }
}