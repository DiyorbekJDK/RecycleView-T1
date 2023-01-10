package com.diyorbek.recycleviewtask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import androidx.core.view.isVisible
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.diyorbek.recycleviewtask.adapter.ItemAdapter
import com.diyorbek.recycleviewtask.adapter.ObjectAdapter
import com.diyorbek.recycleviewtask.model.Filml
import com.diyorbek.recycleviewtask.model.Objects

class Third : AppCompatActivity() {
    private val itemAdapter by lazy { ObjectAdapter() }
    private lateinit var recyclerView2: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        supportActionBar?.hide()
        recyclerView2 = findViewById(R.id.myRecycle)
        recyclerView2.apply {
            layoutManager = GridLayoutManager(this@Third, 2)
            adapter = itemAdapter
        }
        itemAdapter.objectList = myList()
        val btn: Button = findViewById(R.id.btnNext3)
        Handler(Looper.getMainLooper()).postDelayed(Runnable {
            btn.isVisible = true

        }, 5000)
        btn.setOnClickListener {
            val intent = Intent(this, Four::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun myList(): MutableList<Objects> {
        return mutableListOf(
            Objects(R.drawable.laptop_one, "Kotlinjon"),
            Objects(R.drawable.laptop_two, "Java"),
            Objects(R.drawable.laptop_three, "Android"),
            Objects(R.drawable.laptop_four, "Python"),
            Objects(R.drawable.laptop_five, "Windows"),
            Objects(R.drawable.laptop_six, "IOS"),
        )
    }
}