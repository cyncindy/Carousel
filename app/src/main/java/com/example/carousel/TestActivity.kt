package com.example.carousel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class TestActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private var list = ArrayList<TestData>()
    private lateinit var adapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        recyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.HORIZONTAL,
            false
        )

        addDataToList()

        adapter = Adapter(list)

        recyclerView.adapter = adapter
    }

    private fun addDataToList() {
        list.add(TestData(R.drawable.sample))
        list.add(TestData(R.drawable.sample2))
    }
}