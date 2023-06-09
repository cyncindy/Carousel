package com.example.carousel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val dataList: List<BlogData>) : RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {

    inner class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var imageView: ImageView = view.findViewById(R.id.iv_blog)
        var textView: TextView = view.findViewById(R.id.tv_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.CustomViewHolder {
        val itemView: View = LayoutInflater.from(parent.context).inflate(R.layout.blogs, parent, false)
        return CustomViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CustomAdapter.CustomViewHolder, position: Int) {
        holder.imageView.setImageResource(dataList[position].image)
        holder.textView.text = dataList[position].text
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}