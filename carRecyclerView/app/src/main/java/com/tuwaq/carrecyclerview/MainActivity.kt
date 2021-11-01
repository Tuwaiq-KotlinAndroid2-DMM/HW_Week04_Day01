package com.tuwaq.carrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myRecyclerView=findViewById<RecyclerView>(R.id.RecyclerViewCar)
        var carList= mutableListOf<CarModel>(
            CarModel("Mercedes Glc coupe", 270000F,2021,"https://groupeparkavenue.com/sites/default/files/styles/scale_jpeg_1280/https/images.swift.fuseinteractive.ca/chrome/media/ChromeImageGallery/ColorMatched_01/Transparent/1280/cc_2021MBS96_01_1280/cc_2021MBS960013_01_1280_149U.png?"),
            CarModel("BMW X6", 230000F,2021,"https://www.birchwoodbmw.ca/wp-content/uploads/2020/10/cc_2021BMS210001_01_1280_300.png"),
            CarModel("Kia k5", 110000F,2021,"https://s3.us-east-2.amazonaws.com/dealer-inspire-vps-vehicle-images/stock-images/chrome/d0f36ea96bfb29462b5cd527e32039e3.png"),
            CarModel("Lexus RX 450h", 180000F,2021,"https://images.carprices.com/pricebooks_data/usa/colorized/2021/Lexus/View2/RX_450h/F_Sport/9446_1J7.png"))

        myRecyclerView.layoutManager= LinearLayoutManager(this)
        myRecyclerView.adapter= CarAdapter(carList)



        var searchView = findViewById<SearchView>(R.id.CarSearchView)
        searchView.setOnQueryTextListener(object: SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {

                // Toast.makeText(this@MainActivity,newText,Toast.LENGTH_SHORT).show()


                var newData = carList.filter {Car: CarModel ->  Car.name.toLowerCase().contains(newText!!.toLowerCase()) }  as MutableList<CarModel>
                myRecyclerView.adapter = CarAdapter(newData)

                return true
            }

        })


    }
}
