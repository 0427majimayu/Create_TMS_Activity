package com.pineapple.create_tms_activity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TaskAdapter(
    private var taskList: MutableList<Task>?
) : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskAdapter.TaskViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.activity_task, parent, false)
        return TaskViewHolder(v)
    }

    override fun onBindViewHolder(holder: TaskAdapter.TaskViewHolder, position: Int) {
        val item: Task = taskList?.get(position) ?: return

        holder.titleText.text = item.subject
    }

    override fun getItemCount(): Int = taskList?.size ?: 0

    inner class TaskViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titleText: TextView = view.findViewById(R.id.textView)
    }
}

// https://github.com/masashihamaguchi/TodoSample/blob/master/app/src/main/java/com/masashi/todosample/CustomAdapter.kt

// TODO: カスタムアダプターのレイアウトを作成しよう
