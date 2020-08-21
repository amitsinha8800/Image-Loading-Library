package com.amitsinha.image_library

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var layoutManager: LinearLayoutManager
    lateinit var recyclerAdapter: RecyclerAdapter
    var imageList = arrayListOf<Images>(
        Images("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-1_1.jpg"),
        Images("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-2_1.jpg"),
        Images("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-3_1.jpg"),
        Images("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-4_1.jpg"),
        Images("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-5_1.jpg"),
        Images("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-6_1.jpg"),
        Images("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-7_0.jpg"),
        Images("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-8_1.jpg"),
        Images("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-9_1.jpg")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)
        layoutManager = LinearLayoutManager(this)
        recyclerAdapter = RecyclerAdapter(
            this, imageList
        )
        recyclerView.adapter = recyclerAdapter
        recyclerView.layoutManager = layoutManager


    }
}