package com.example.homeworkweek4d1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import layout.Cars

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide()
        var carslist = mutableListOf<Cars>(
            Cars("BMW",2020,200000.0,"https://th.bing.com/th/id/R.3035da81eb01aad6a42c9af736e41e85?rik=wP7jTT%2b%2fhvvR3g&riu=http%3a%2f%2fwww.ausmotive.com%2fpics%2f2015%2fBMW-Concept-M4-GTS-03.jpg&ehk=nDAKrGo8rvzGQ4%2bY6LTQHiawxLmFNAF8PZBpEFRfEPg%3d&risl=&pid=ImgRaw&r=0"),
            Cars("Jeep",2019,1000000.0,"https://www.bing.com/images/search?view=detailV2&ccid=i%2bj8nAYK&id=72C48BE6F1F5231E0CCE4B1A0F7A641DCF99FF4E&thid=OIP.i-j8nAYKWqhFCsqR_IochwHaE8&mediaurl=https%3a%2f%2fcdn.drivingline.com%2fmedia%2f2331900%2f001-2020-jeep-gladiator-rubicon-rugged-ridge-arcus-winch-front-bumper.jpg&cdnurl=https%3a%2f%2fth.bing.com%2fth%2fid%2fR.8be8fc9c060a5aa8450aca91fc8a1c87%3frik%3dTv%252bZzx1keg8aSw%26pid%3dImgRaw%26r%3d0&exph=1080&expw=1618&q=jeep&simid=607987865420657339&FORM=IRPRST&ck=E51B0072386941EDD1FE9502D6A55FC7&selectedIndex=0"),
            Cars("mercedes",2021,300000.0,"https://www.bing.com/images/search?view=detailV2&ccid=j7Ifz6G5&id=8CABA8C20D89AFC3FFF6B6E1D8EB432A05C0AB74&thid=OIP.j7Ifz6G5TmTSVL1IHG0XqAHaE8&mediaurl=https%3a%2f%2fimages.carexpert.com.au%2fcrop%2f1200%2f630%2fvehicles%2fsource-g%2f9%2f9%2f99a4e8f6.jpg&cdnurl=https%3a%2f%2fth.bing.com%2fth%2fid%2fR.8fb21fcfa1b94e64d254bd481c6d17a8%3frik%3ddKvABSpD69jhtg%26pid%3dImgRaw%26r%3d0&exph=600&expw=900&q=mercedes-benz&simid=608055012935826237&FORM=IRPRST&ck=08ED73030272F60C044FA0E2597F3C0E&selectedIndex=7")

        )

        var myRecyclerView = findViewById<RecyclerView>(R.id.mRecyclerview)
        myRecyclerView.layoutManager = LinearLayoutManager(this)
        myRecyclerView.adapter = CarAdapter(carslist)

        var searchView = findViewById<SearchView>(R.id.msearchView)
        searchView.setOnQueryTextListener(object: SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {

                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                var newData = carslist.filter { car: Cars -> car.name.toLowerCase().contains(newText!!.toLowerCase()) }  as MutableList<Cars>
                myRecyclerView.adapter = CarAdapter(newData)

                return true
            }
        })
    }
}


