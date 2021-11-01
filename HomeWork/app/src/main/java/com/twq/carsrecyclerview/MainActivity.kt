package com.twq.carsrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.twq.carsrecyclerview.Adapter.CustomAdapter
import com.twq.carsrecyclerview.Model.Car

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cars: MutableList<Car> = mutableListOf(
            Car("BMW","https://www.bmw-yemen.com/content/dam/bmw/common/all-models/5-series/sedan/2020/navigation/bmw-5-series-sedan-POSI-modelfinder.png",300_000,2021),
            Car("Mercedes","https://www.mercedes-benz-mena.com/en/passengercars/_jcr_content/image.MQ6.2.2x.20191226113517.png",200_000,2018),
            Car("Toyota","https://www.toyota.com.sa/-/media/Feature/ToyotaKSA/Vehicle/Mini-Vans/Avanza/Avanza520x220.png",100_000,2019),
            Car("Honda","https://images.honda.ca/models/H/Models/2021/accord_sedan/se_10679_nh_830mlunar_silver_metallic_front.png?trim.percentpadding=5&trim.threshold=80&width=380",150_000,2020),
        )

        var mRecyclerView = findViewById<RecyclerView>(R.id.mRecyclerView)

        // link recyclerView to adapter

        mRecyclerView.adapter = CustomAdapter(cars)

        // set layout manager

        mRecyclerView.layoutManager = LinearLayoutManager(this)



    }
}