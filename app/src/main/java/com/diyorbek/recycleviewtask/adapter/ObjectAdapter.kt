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
import com.diyorbek.recycleviewtask.model.Item
import com.diyorbek.recycleviewtask.model.Objects

class ObjectAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var objectList: MutableList<Objects> = mutableListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.objectt_list, parent, false)
        return itemViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as itemViewHolder).bind(objectList[position])
    }

    override fun getItemCount(): Int {
        return objectList.size
    }

    inner class itemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        fun bind(objects: Objects) {
            val image: ImageView = view.findViewById(R.id.objectImage)
            val name: TextView = view.findViewById(R.id.objectName)
            image.setImageResource(objects.image)
            name.text = objects.name
        }
    }
}