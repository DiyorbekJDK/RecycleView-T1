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

class ItemAdapter(): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var itemList: MutableList<Item> = mutableListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent,false)
        return itemViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as itemViewHolder).bind(itemList[position])
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    inner class itemViewHolder(private val view: View): RecyclerView.ViewHolder(view){
     fun bind(item: Item){
         val image: ImageView = view.findViewById(R.id.itemImage)
         val name: TextView = view.findViewById(R.id.itemName)
         val colorB: LinearLayout = view.findViewById(R.id.backgroundColor)
         image.setImageResource(item.itemImage)
         name.text = item.itemName
         colorB.background = item.backColor.toDrawable()
     }
    }
}