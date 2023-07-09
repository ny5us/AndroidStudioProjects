package com.tim.todoo

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.tim.todoo.databinding.ActivityMainBinding
import android.widget.ArrayAdapter


class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var taskList = arrayListOf<String>()
        val items = listOf<String>("hi", "hello")
        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, taskList)

        binding.plusButton.setOnClickListener {
            taskList.add(binding.newTaskEntry.text.toString())
            binding.toDoListView.adapter = arrayAdapter

            arrayAdapter.notifyDataSetChanged()
            binding.newTaskEntry.text.clear()
        }
    }
}