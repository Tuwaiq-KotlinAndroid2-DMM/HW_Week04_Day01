package com.twq.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.twq.homework.Model.Car
import com.twq.homework.Model.CarAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var carList = mutableListOf<Car>(
            Car("BMW",getString(R.string.bmw),300000.0f,2020),
            Car("Jaguar",getString(R.string.jaguarimg),720000.0f,2020),
            Car("Tesla",getString(R.string.Ximg),270000.0f,2020),
            Car("Aston Martin",getString(R.string.Aston),2000000.0f,2020),
            Car("Cadillac",getString(R.string.cady),166000.0f,1966),

        )

        var cRecyclerView = findViewById<RecyclerView>(R.id.cRecyclerView)
        cRecyclerView.layoutManager = LinearLayoutManager(this)
        cRecyclerView.adapter = CarAdapter(carList)

        var searchView = findViewById<SearchView>(R.id.searchViewCar)
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String?): Boolean {
                return true
            }
            override fun onQueryTextChange(p0: String?): Boolean {
                var newData = carList.filter {car: Car -> car.carName.toLowerCase().contains(p0!!)  } as MutableList<Car>
                cRecyclerView.adapter = CarAdapter(newData)
                return true
            }
        })
    }
}