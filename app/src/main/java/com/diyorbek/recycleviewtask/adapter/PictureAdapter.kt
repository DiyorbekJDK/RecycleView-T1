package com.diyorbek.recycleviewtask.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.diyorbek.recycleviewtask.R
import com.diyorbek.recycleviewtask.model.Image
import com.diyorbek.recycleviewtask.model.Pictures

class PictureAdapter() : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var pictureList: MutableList<Pictures> = mutableListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.second_horizontal, parent, false)
        return itemViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as itemViewHolder).bind(pictureList[position])
    }

    override fun getItemCount(): Int {
        return pictureList.size
    }

    inner class itemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        fun bind(pictures: Pictures) {
            val image: ImageView = view.findViewById(R.id.imagePicture)
            val txt: TextView = view.findViewById(R.id.imageName)
            image.setImageResource(pictures.pictureImage)
            txt.text = pictures.pictureName

        }
    }
}