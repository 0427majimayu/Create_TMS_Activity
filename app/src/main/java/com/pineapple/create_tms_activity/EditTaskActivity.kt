package com.pineapple.create_tms_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.pineapple.create_tms_activity.databinding.ActivityEditTaskBinding
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
        setContentView(binding.root)

        binding.EditButton.setOnClickListener {

         val  task = binding.subjectEdit.text.toString()

            if (task != "") {
                createTask(task)
                binding.subjectEdit.setText("")
            }


            onBackPressed()

        }

    }

    override fun onDestroy() {
        super.onDestroy()
        realm.close()
    }

    private fun createTask(subject: String) {
        realm.executeTransaction {
            val task = it.createObject(Task::class.java, UUID.randomUUID().toString())
            task.subject = subject
            //       task.memo = "※メモ※"
        }
        Log.d("create", subject)
    }
}