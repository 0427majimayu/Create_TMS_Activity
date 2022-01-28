package com.pineapple.create_tms_activity

import android.app.Dialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.TimePicker
import com.pineapple.create_tms_activity.databinding.ActivityEditWeeklyBinding
import java.text.SimpleDateFormat
import java.util.*

class EditWeeklyActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditWeeklyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEditWeeklyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startTimeEdit.setOnClickListener() {
            val cal = Calendar.getInstance()

            val timeSetListener = TimePickerDialog.OnTimeSetListener { timePicker, hour, minute ->
                cal.set(Calendar.HOUR_OF_DAY, hour)
                cal.set(Calendar.MINUTE, minute)

                binding.startTimeEdit.setText(SimpleDateFormat("HH:mm").format(cal.time))
            }

            //タイムピッカーダイアログを生成および設定
            TimePickerDialog(
                this,
                timeSetListener,
                cal.get(Calendar.HOUR_OF_DAY),
                cal.get(Calendar.MINUTE),
                true
            ).show()
        }
    }

}

