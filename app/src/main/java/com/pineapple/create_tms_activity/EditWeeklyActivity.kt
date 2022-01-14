package com.pineapple.create_tms_activity

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.pineapple.create_tms_activity.databinding.ActivityEditWeeklyBinding
import java.text.SimpleDateFormat
import java.util.*

class EditWeeklyActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditWeeklyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEditWeeklyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startTimeEdit.setOnClickListener(){
            showTimePickerDialog()

        }

        binding.returnButton.setOnClickListener(){
            finish()
        }
    }

    fun showTimePickerDialog() {
        val calendar: Calendar = Calendar.getInstance()

        val timeSetListener = TimePickerDialog.OnTimeSetListener { timePicker, i, i2 ->
            calendar.set(Calendar.HOUR_OF_DAY, Calendar.HOUR,Calendar.MINUTE,)
        }
        TimePickerDialog(this,timeSetListener,calendar.get(Calendar.HOUR),calendar.get(Calendar.MINUTE),true).show()

        binding.startTimeEdit.setText(SimpleDateFormat("HH/mm").format(timeSetListener))
    }

}