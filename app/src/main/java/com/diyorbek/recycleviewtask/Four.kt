package com.diyorbek.recycleviewtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.diyorbek.recycleviewtask.adapter.ImageAdapter
import com.diyorbek.recycleviewtask.adapter.ImageSecond
import com.diyorbek.recycleviewtask.adapter.PictureAdapter
import com.diyorbek.recycleviewtask.model.Image
import com.diyorbek.recycleviewtask.util.Constants

class Four : AppCompatActivity() {
    private val imageDapter by lazy { ImageAdapter() }
    private val imageSecondDapter by lazy { ImageSecond() }
    private val pictureDapter by lazy { PictureAdapter() }
    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerView1: RecyclerView
    private lateinit var recyclerView2: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four)
        supportActionBar?.hide()
        recyclerView = findViewById(R.id.recycleHorizontal)
        recyclerView1 = findViewById(R.id.recycleHorizontal2)
        recyclerView2 = findViewById(R.id.recycleHorizontal3)
        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@Four, LinearLayoutManager.HORIZONTAL, false)
            adapter = imageDapter
        }
        recyclerView1.apply {
            layoutManager = LinearLayoutManager(this@Four, LinearLayoutManager.HORIZONTAL, false)
            adapter = pictureDapter
        }
        recyclerView2.apply {
            layoutManager = LinearLayoutManager(this@Four, LinearLayoutManager.HORIZONTAL, false)
            adapter = imageSecondDapter
        }
        imageDapter.imageList = Constants.imageList()
        pictureDapter.pictureList = Constants.pictureList()
        imageSecondDapter.imageList = Constants.imageList()
    }

}