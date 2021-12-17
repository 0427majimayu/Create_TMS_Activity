package com.pineapple.create_tms_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class EditWeeklyActivity : AppCompatActivity() {
    lateinit var time_setText:TextView
    lateinit var start_timeEdit:EditText
    lateinit var end_timeEdit:EditText
    lateinit var scheduleText:TextView
    lateinit var scheduleEdit:EditText
    lateinit var returnButton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_weekly)
        time_setText = findViewById(R.id.time_setText)
        start_timeEdit = findViewById(R.id.start_timeEdit)
        end_timeEdit = findViewById(R.id.end_timeEdit)
        scheduleText = findViewById(R.id.scheduleText)
        scheduleEdit = findViewById(R.id.scheduleEdit)
        returnButton = findViewById(R.id.returnButton)

        returnButton.setOnClickListener(){
            finish()
        }
    }
}