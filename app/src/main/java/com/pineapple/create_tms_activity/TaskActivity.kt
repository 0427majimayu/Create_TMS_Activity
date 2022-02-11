package com.pineapple.create_tms_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import androidx.recyclerview.widget.LinearLayoutManager
import com.pineapple.create_tms_activity.databinding.ActivityTaskBinding
import io.realm.Realm

class TaskActivity : AppCompatActivity() {
    lateinit var calendarView: CalendarView
    lateinit var finishButton: Button

    private lateinit var binding: ActivityTaskBinding
    private val realm: Realm by lazy {
        Realm.getDefaultInstance()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        calendarView = findViewById(R.id.calendarView)
//        finishButton = findViewById(R.id.finishiButton)

        binding = ActivityTaskBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // TODO: Realmからデータを取得
        val results = realm.where(Task::class.java).findAll()
        val taskList: MutableList<Task>? = results.toMutableList()
        val adapter = TaskAdapter(taskList)

        // TODO: RecyclerViewにAdapterをセット
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter


        // TODO タスクを新しく追加するボタン
         binding.fab.setOnClickListener() {
             val intent = Intent(applicationContext,EditTaskActivity::class.java)
             startActivity(intent)
         }

         finishButton.setOnClickListener() {
            finish()
        }

    }
}