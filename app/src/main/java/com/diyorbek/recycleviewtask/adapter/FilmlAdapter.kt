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
import com.diyorbek.recycleviewtask.model.Filml
import com.diyorbek.recycleviewtask.model.Item

class FilmlAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var filmList: MutableList<Filml> = mutableListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.films_list, parent, false)
        return itemViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as itemViewHolder).bind(filmList[position])
    }

    override fun getItemCount(): Int {
        return filmList.size
    }

    inner class itemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        fun bind(filml: Filml) {
            val image: ImageView = view.findViewById(R.id.filmImage)
            val name: TextView = view.findViewById(R.id.filmName)
            val views: TextView = view.findViewById(R.id.filmViews)
            val date: TextView = view.findViewById(R.id.filmDate)

            image.setImageResource(filml.finlImage)
            name.text = filml.filmName
            views.text = filml.filnViews
            date.text = filml.filmDate
        }
    }
}