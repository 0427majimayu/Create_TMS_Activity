package com.pineapple.create_tms_activity

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pineapple.create_tms_activity.databinding.ActivityEditTaskBinding
import com.pineapple.create_tms_activity.databinding.ActivityEditWeeklyBinding
import io.realm.Realm
import java.util.*

class EditTaskActivity : AppCompatActivity() {

    // TODO
    private lateinit var binding: ActivityEditTaskBinding
    private val realm: Realm by lazy {
         Realm.getDefaultInstance()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEditTaskBinding.inflate(layoutInflater)

        // TODO: https://github.com/masashihamaguchi/TodoSample/blob/master/app/src/main/java/com/masashi/todosample/MainActivity.kt
        binding.EditButton.setOnClickListener {
//            val date = binding.textInputEditText.text.toString()
////            if (subject != ""){
//                createTask()
//            }

            realm.executeTransaction {
                val task = it.createObject(Task::class.java,UUID.randomUUID().toString())
//                task.date = binding.
                task.subject = binding.subjectEdit.text.toString()
            }
        }
    }
}