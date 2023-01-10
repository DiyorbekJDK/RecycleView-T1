package com.diyorbek.recycleviewtask

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.diyorbek.recycleviewtask.adapter.ItemAdapter
import com.diyorbek.recycleviewtask.model.Item

class MainActivity : AppCompatActivity() {
    private val itemAdapter by lazy { ItemAdapter() }
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        recyclerView = findViewById(R.id.recycleView)
        recyclerView.apply {
            layoutManager = GridLayoutManager(this@MainActivity, 3)
            adapter = itemAdapter
        }
        itemAdapter.itemList = myList()
        val btn: Button = findViewById(R.id.btnNext)
        Handler(Looper.getMainLooper()).postDelayed(Runnable {
            btn.isVisible = true

        }, 5000)
        btn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
            finish()
        }


    }

    private fun myList(): MutableList<Item> {
        return mutableListOf(
            Item(
                R.drawable.car_icon, "Automotive", ContextCompat.getColor(
                    this@MainActivity,
                    R.color.red
                )
            ),
            Item(R.drawable.battery, "Battery", ContextCompat.getColor(
                this@MainActivity,
                R.color.orange
            )),
            Item(R.drawable.hammer, "Construction", ContextCompat.getColor(
                this@MainActivity,
                R.color.yellow
            )),
            Item(R.drawable.turn_on, "Electronics", ContextCompat.getColor(
                this@MainActivity,
                R.color.yellow2
            )),
            Item(R.drawable.leaf, "Garden", ContextCompat.getColor(
                this@MainActivity,
                R.color.green
            )),
            Item(R.drawable.bottle, "Glass", ContextCompat.getColor(
                this@MainActivity,
                R.color.teal_700
            )),
            Item(R.drawable.warning, "Hazardous", ContextCompat.getColor(
                this@MainActivity,
                R.color.blue
            )),
            Item(R.drawable.ic_baseline_home_24, "HouseHold", ContextCompat.getColor(
                this@MainActivity,
                R.color.blue2
            )),
            Item(R.drawable.metal, "Metal", ContextCompat.getColor(
                this@MainActivity,
                R.color.purple_700
            )),
            Item(R.drawable.paint, "Paint", ContextCompat.getColor(
                this@MainActivity,
                R.color.purple_200
            )),
            Item(R.drawable.paper, "Paper", ContextCompat.getColor(
                this@MainActivity,
                R.color.purple_500
            )),
            Item(R.drawable.plastic, "Plastic", ContextCompat.getColor(
                this@MainActivity,
                R.color.pink
            )),
        )
    }
}