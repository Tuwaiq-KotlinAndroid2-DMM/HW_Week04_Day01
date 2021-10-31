package com.example.day16hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var listOfCars = mutableListOf<CarModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //this.supportActionBar?.hide()

        populateList()

        val recycledView = findViewById<RecyclerView>(R.id.RecycledViewCar)
        setRecycledView(recycledView)

        val searchView = findViewById<SearchView>(R.id.searchViewMovie)
        searchFromListView(recycledView, searchView)
    }

    private fun searchFromListView(recycledView: RecyclerView, searchView: SearchView) {
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                val newData = listOfCars.filter { (it.name.lowercase().contains(query!!.lowercase())) }
                recycledView.adapter = CarAdapter(newData as MutableList<CarModel>)

                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                val newData = listOfCars.filter { (it.name.lowercase().contains(newText!!.lowercase())) }
                recycledView.adapter = CarAdapter(newData as MutableList<CarModel>)
                return true
            }
        })
    }

    private fun setRecycledView(recycledView: RecyclerView) {
        recycledView.layoutManager = LinearLayoutManager(this)
        recycledView.adapter = CarAdapter(listOfCars)
    }

    fun populateList(){
        listOfCars.add(CarModel(getString(R.string.carName1),getString(R.string.carURL1),490980.0,2021))
        listOfCars.add(CarModel(getString(R.string.carName2),getString(R.string.carURL2),190650.0,1964))
        listOfCars.add(CarModel(getString(R.string.carName3),getString(R.string.carURL3),240000.0,2020))
        listOfCars.add(CarModel(getString(R.string.carName4),getString(R.string.carURL4),130500.0,2019))
        listOfCars.add(CarModel(getString(R.string.carName5),getString(R.string.carURL5),130000.0,2021))
        listOfCars.add(CarModel(getString(R.string.carName6),getString(R.string.carURL6),90950.0,2020))
    }
}