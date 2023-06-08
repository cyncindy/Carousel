package com.example.carousel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageSlider: ImageSlider = findViewById(R.id.slider)

        val slideModels: MutableList<SlideModel> = ArrayList()

        slideModels.add(SlideModel("https://picsum.photos/seed/picsum/200/300"))
        slideModels.add(SlideModel("https://picsum.photos/id/237/200/300"))
        slideModels.add(SlideModel("https://picsum.photos/send/picsum/200/300"))
        slideModels.add(SlideModel("https://picsum.photos/200/300?grayscale"))
        slideModels.add(SlideModel("https://picsum.photos/200/300/blur"))

        imageSlider.setImageList(slideModels)
        imageSlider.startSliding(3000)
    }
}