package com.example.care

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var Carlist = mutableListOf<Car>(
        Car("BMW",2020,300000,"https://www.rushlane.com/wp-content/uploads/2020/12/2021-bmw-3-series-gran-limousine-launch-india-price-2.jpg"),
        Car ("KIA",2021,40000,"https://th.bing.com/th/id/R.a4d9040dc60cccd9f5cec2bd8eb9e2d0?rik=2dvT5ttL5kddXA&pid=ImgRaw&r=0")
        )
        var myRecyclerView = findViewById<RecyclerView>(R.id.mRecyclerView)
        myRecyclerView .layoutManager = LinearLayoutManager(this)
        myRecyclerView.adapter = Caradapter(Carlist)
    }
        }
            