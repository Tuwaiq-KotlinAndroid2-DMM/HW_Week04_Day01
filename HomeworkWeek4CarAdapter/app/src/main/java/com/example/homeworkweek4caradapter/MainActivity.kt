package com.example.homeworkweek4caradapter

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

        var CarsList= mutableListOf<Cars>(

            Cars("BMW",150000.0,2019,"https://images.cars.com/cldstatic/wp-content/uploads/2019-BMW-3-Series-front-OEM.jpg"),
            Cars("Mercedes",200540.0,2018,"https://www.mercedesbenzoftyler.com/assets/shared/CustomHTMLFiles/Responsive/MRP/Mercedes-Benz/2018/C-Class/images/2018-Mercedes-Benz-C-Class-01.jpg"),
            Cars("Audi",190875.6,2018,"https://www.automoblog.net/wp-content/uploads/2017/04/2458-2018AudiTTRSCoupe.jpg"),
            Cars("Toyota",60670.0,2020,"https://di-uploads-pod4.dealerinspire.com/brentbrowntoyota/uploads/2016/05/2017-Toyota-Prius-Prime-300x171.jpg"),
            Cars("Ford",150999.9,2016,"https://static.cargurus.com/images/site/2015/10/20/10/26/2016_ford_fusion-pic-138577834783239986-640x480.jpeg"),
            Cars("Mazda",70552.0,2015,"https://media.ed.edmunds-media.com/mazda/3/2014/oem/2014_mazda_3_sedan_s-grand-touring_fq_oem_1_815.jpg")
        )

        var myRecyclerView=findViewById<RecyclerView>(R.id.recyclerViewCarList)
        myRecyclerView.layoutManager=LinearLayoutManager(this)
        myRecyclerView.adapter = CarAdapter(CarsList)

        var searchView=findViewById<SearchView>(R.id.searchViewCars)
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
               var newData=CarsList.filter { cars : Cars -> cars.name.toLowerCase().contains(newText!!.toLowerCase()) }as MutableList<Cars>
                myRecyclerView.adapter=CarAdapter(newData)
                return true
            }

        })
    }
}