package com.login.hw_w4d1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var CarList= mutableListOf<Car>(

            Car("BMW","X5",2021,200000,
                "https://ksa.motory.com/tinymce/bmw_my21_x5_x5xdrive45e_overview_05.webp"),

        Car("MINI COOPER","S3-Door Hatch",2021,150000,
            "https://www.autocar.co.uk/sites/autocar.co.uk/files/images/car-reviews/" +
                    "first-drives/legacy/1-mini-cooper-s-2021-uk-fd-hero-front.jpg"),

        Car("BEBTLEY","Bantayga",2021,1000000,
            "https://striveme.com/img/2021/%D9%85%D8%B9%D9%84%D9%88%D9%85%D8%A7%D8%AA/1/" +
                    "%D8%A8%D9%86%D8%AA%D9%84%D9%8A%20%D8%AC%D9%8A%20%D8%AA%D9%8A.jpg"),

        )


      var cRecyclerView= findViewById<RecyclerView>(R.id.cRecyclerView)
        cRecyclerView.layoutManager= LinearLayoutManager(this)

        cRecyclerView.adapter = CarAdapter(CarList)

        var searchView = findViewById<SearchView>(R.id.csearchView)
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String?): Boolean {
                return true
            }
            override fun onQueryTextChange(p0: String?): Boolean {
                var newData = CarList.filter {car: Car -> car.name.toLowerCase().contains(p0!!)  } as MutableList<Car>
                cRecyclerView.adapter = CarAdapter(newData)
                return true
            }
        })
    }
}





