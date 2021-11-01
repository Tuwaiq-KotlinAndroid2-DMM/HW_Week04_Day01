package com.example.carsrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()

        var carList = mutableListOf<Car>(
            Car("BMW X6 M",650000.0,2020, "https://www.ccarprice.com/products/BMW-X6-M-2021.jpg"),
            Car("Audi A6", 280000.0, 2021, "https://ymimg1.b8cdn.com/resized/car_model/5316/logo/mobile_listing_main_01.png"),
            Car("Mazda CX-5",145000.0,2021,"https://leveillemazdalaval.com/optimised_images/wp-content/uploads/vehicle_models/images/12/trim_284/color_25D/cc_2021MAS060063_01_1280_25D-730x548.png")
        )

        var myRecyclerView = findViewById<RecyclerView>(R.id.mRecyclerView)
        myRecyclerView.layoutManager = LinearLayoutManager(this)
        myRecyclerView.adapter = CarsAdapter(carList)

        var mySearchView = findViewById<androidx.appcompat.widget.SearchView>(R.id.searchView)

        mySearchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
            androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String?): Boolean {
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                var newData = carList.filter { car: Car -> car.name.toLowerCase().contains(newText!!.toLowerCase()) } as MutableList<Car>
                myRecyclerView.adapter=CarsAdapter(newData)
                return true
            }
        })
    }


}