package com.example.carousel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class BlogActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private var dataList = ArrayList<BlogData>()
    private lateinit var adapter: CustomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blog)

        recyclerView = findViewById(R.id.recyclerView2)

        recyclerView.setHasFixedSize(true)

        recyclerView.layoutManager = GridLayoutManager(this, 2)

        addBlogToList()

        adapter = CustomAdapter(dataList)

        recyclerView.adapter = adapter
    }

    private fun addBlogToList() {
        dataList.add(BlogData(R.drawable.basil, "Basil"))
        dataList.add(BlogData(R.drawable.chili, "Chili"))
        dataList.add(BlogData(R.drawable.leaves, "Leaves"))
        dataList.add(BlogData(R.drawable.pakchoy, "Pakchoy"))
        dataList.add(BlogData(R.drawable.something, "Something"))
        dataList.add(BlogData(R.drawable.spinach, "Spinach"))
    }

}