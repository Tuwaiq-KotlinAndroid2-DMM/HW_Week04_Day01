package com.example.week4day1hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var carList = mutableListOf<Car>(
            Car(
                "BMW X4",
                240000,
                2020,"https://s3.eu-central-1.amazonaws.com/v3-ncg.motory.com/vehicle-new/l-1622545724.209-60b6153c33094.webp"
            ),
            Car(
                "Audi a4",
                400000,
                2021,
                "https://www.egy-car.com/wp-content/uploads/2020/04/%D8%A7%D9%88%D8%AF%D9%8A-A4-600x400.jpg"
            ),
            Car(
                "Kona",
                85000,
                2021,
                "https://albilad.s3.me-south-1.amazonaws.com/images/news/2020/07/thumbnails/main/f252220234978.jpg"
            ),
            Car(
                "Lexus rx",
                200000,
                2021,
                "https://motorzeen.com/wp-content/uploads/2020/09/25D9258425D9258325D825B225D825B32BRX2B2021.jpg"
            )




        )

        var mRecyclerView = findViewById<RecyclerView>(R.id.mRecyclerView)
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mRecyclerView.adapter = CarAdapter(carList)


    }
}