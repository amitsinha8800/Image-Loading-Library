package com.amitsinha.image_library

import android.content.Context
import android.graphics.DashPathEffect
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class RecyclerAdapter(val context:Context,val itemList:ArrayList<Images>):RecyclerView.Adapter<RecyclerAdapter.HomeViewHolder>() {
    class HomeViewHolder(view:View):RecyclerView.ViewHolder(view){
        val numberImage:ImageView = view.findViewById(R.id.imgRecyclerRowNumbers)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.single_row_layout,parent,false)
        return HomeViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val image = itemList[position]
        Picasso.get().load(image.imageUrl).error(R.drawable.one).into(holder.numberImage)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}