package com.example.week4_day1_hw

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
        var mSearchView = findViewById<androidx.appcompat.widget.SearchView>(R.id.mSearchView)
        var mRecyclerView = findViewById<RecyclerView>(R.id.mRecyclerView)


        var carList = mutableListOf<Car>(
            Car("Mercedes-Benz S-Class","$110,850","2021","https://thumbor.forbes.com/thumbor/fit-in/960x600/https://www.forbes.com/wheels/wp-content/uploads/2021/02/2021_Mercedes_S-Class_Gallery5.jpg"),
            Car("Audi A8","$86,500","2021","https://thumbor.forbes.com/thumbor/fit-in/960x600/filters:format(jpg)/https://www.forbes.com/wheels/wp-content/uploads/2020/10/2021_Audi_A8_gallery_1.png"),
            Car("BMW 5 Series","$54,200","2021","https://thumbor.forbes.com/thumbor/fit-in/960x600/https://www.forbes.com/wheels/wp-content/uploads/2020/10/2021_BMW_5_Series_Gallery1.jpg")
        )

        mRecyclerView.layoutManager = LinearLayoutManager(this)

        mRecyclerView.adapter=CarAdapter(carList)

        mSearchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
            androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String?): Boolean {
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                var newData = carList.filter { car: Car ->
                    car.name.toLowerCase().contains(newText!!.toLowerCase())
                } as MutableList<Car>
                mRecyclerView.adapter = CarAdapter(newData)
                return true
            }

        })





    }
}