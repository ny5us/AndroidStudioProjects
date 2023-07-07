package com.tim.todoo

import android.R.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var taskList = arrayListOf<String>()

        var arrayAdapter = ArrayAdapter<String>(this,
            layout.simple_list_item_multiple_choice,taskList)
        addButton.setOnClickListener {
            taskList.add(newTaskEntry.text.toString())

            toDoListView.adapter = arrayAdapter

            arrayAdapter.notifyDataSetChanged()

            newTaskEntry.text.clear()
        }
    }
}