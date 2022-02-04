package com.pineapple.create_tms_activity

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TaskAdapter () : RecyclerView.Adapter<TaskAdapter.>(
    private var taskList: MutableList<Task>?
) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.CustomViewHolder {

    }

    override fun onBindViewHolder(holder: CustomAdapter.CustomViewHolder, position: Int) {

    }

    override fun getItenCount(): Int = taskList?.size ?: 0

    inner class TaskViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }
}

// https://github.com/masashihamaguchi/TodoSample/blob/master/app/src/main/java/com/masashi/todosample/CustomAdapter.kt

// TODO: カスタムアダプターのレイアウトを作成しよう
