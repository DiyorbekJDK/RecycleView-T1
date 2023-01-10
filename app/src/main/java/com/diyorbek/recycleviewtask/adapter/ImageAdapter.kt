package com.diyorbek.recycleviewtask.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.graphics.drawable.toDrawable
import androidx.recyclerview.widget.RecyclerView
import com.diyorbek.recycleviewtask.R
import com.diyorbek.recycleviewtask.model.Image
import com.diyorbek.recycleviewtask.model.Item

class ImageAdapter() : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var imageList: MutableList<Image> = mutableListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.firstr_horizontal, parent, false)
        return itemViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as itemViewHolder).bind(imageList[position])
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    inner class itemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        fun bind(image2: Image) {
            val image: ImageView = view.findViewById(R.id.myImage)
            image.setImageResource(image2.image)

        }
    }
}