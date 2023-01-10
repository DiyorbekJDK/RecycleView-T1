package com.diyorbek.recycleviewtask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.diyorbek.recycleviewtask.adapter.FilmlAdapter
import com.diyorbek.recycleviewtask.adapter.ItemAdapter
import com.diyorbek.recycleviewtask.model.Filml
import com.diyorbek.recycleviewtask.model.Item

class SecondActivity : AppCompatActivity() {
    private val itemAdapter by lazy { FilmlAdapter() }
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        supportActionBar?.hide()
        recyclerView = findViewById(R.id.recycleView2)
        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@SecondActivity)
            adapter = itemAdapter
        }
        val btn: Button = findViewById(R.id.btnNext2)
        Handler(Looper.getMainLooper()).postDelayed(Runnable {
            btn.isVisible = true

        }, 5000)
        btn.setOnClickListener {
            val intent2 = Intent(this, Third::class.java)
            startActivity(intent2)
            finish()
        }
        itemAdapter.filmList = myList()
    }

    private fun myList(): MutableList<Filml> {
        return mutableListOf(
            Filml(R.drawable.avengers_one, "Avengers", "View: 500", "Release Date: 16 Feb 2018"),
            Filml(
                R.drawable.avenger_two,
                "Avengers age of Ultron",
                "View: 400",
                "Release Date: 17 March 2018"
            ),
            Filml(R.drawable.avengers_3, "Iron Man 3", "View: 550", "Release Date: 17 April 2018"),
            Filml(
                R.drawable.avenger_four,
                "Avengers infinity war",
                "View: 1500",
                "Release Date: 15 Jan 2018"
            ),
        )
    }
}