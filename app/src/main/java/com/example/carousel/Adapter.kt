package com.example.carousel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val list: List<TestData>) : RecyclerView.Adapter<Adapter.MyView>() {

    inner class MyView(view: View) : RecyclerView.ViewHolder(view) {
        var imageView: ImageView = view.findViewById(R.id.content)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.MyView {
        val itemView: View = LayoutInflater.from(parent.context).inflate(R.layout.items, parent, false)
        return MyView(itemView)
    }

    override fun onBindViewHolder(holder: Adapter.MyView, position: Int) {
        holder.imageView.setImageResource(list[position].image)
    }

    override fun getItemCount(): Int {
        return list.size
    }

}