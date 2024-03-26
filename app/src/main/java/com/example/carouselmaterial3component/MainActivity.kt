package com.example.carouselmaterial3component

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.carousel.CarouselLayoutManager
import com.google.android.material.carousel.HeroCarouselStrategy

class MainActivity : AppCompatActivity() {

    lateinit var multi_browse_recycler_view : RecyclerView
    lateinit var hero_recycler_view : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initialize RecyclerViews
        multi_browse_recycler_view = findViewById(R.id.multi_browse_recycler_view)
        hero_recycler_view = findViewById(R.id.hero_recycler_view)

        // List of Images
        val picturesList = arrayListOf(R.drawable.pic1,R.drawable.pic22,R.drawable.pic3,R.drawable.pic4,R.drawable.pic5)

        // Adapter
        val adapter = RecViewAdapter(picturesList,this)

        // multi browse Strategy RecyclerView
        multi_browse_recycler_view.layoutManager = CarouselLayoutManager()
        multi_browse_recycler_view.adapter = adapter


        // Hero Strategy RecyclerView
        hero_recycler_view.layoutManager = CarouselLayoutManager(HeroCarouselStrategy())
        hero_recycler_view.adapter = adapter


    }
}