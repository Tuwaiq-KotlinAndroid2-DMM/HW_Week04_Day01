package com.example.myapplicationhomeworkeday1week4

import CareAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

var carsList: MutableList<Cars> = mutableListOf(

Cars("BMW",2020,250000,"https://www.bmwgroup.com/content/dam/grpw/websites/bmwgroup_com/home/720x720_New_7_Series.jpg.grp-transform/small/720x720_New_7_Series.jpg"),
    Cars("KIA",2020,200000,"https://ymimg1.b8cdn.com/uploads/car_model/6116/pictures/5578951/01.jpg"),
            Cars("TOYOTA",2020,250000,"https://alquds.com/wp-content/uploads/2021/08/Toyota-RAV4_Plug-in_Hybrid-2021-1600-09.jpeg")



)
        var recycleViwe=findViewById<RecyclerView>(R.id.recyclerView)
recycleViwe.layoutManager=LinearLayoutManager(this)
recycleViwe.adapter=CareAdapter(carsList)
        var intint= Intent(this,MainActivity::class.java)
        var data:MutableList<Cars>
        intint.getSerializableExtra(toString())



        var searchView=findViewById<SearchView>(R.id.searchView)
        searchView.setOnQueryTextListener(object :SearchView.OnQueryTextListener{

            override fun onQueryTextSubmit(query: String?): Boolean {
                return true


            }

            override fun onQueryTextChange(newText: String?): Boolean {
                var newData=carsList.filter { cars: Cars -> title.contains(newText!!)} as MutableList<Cars>

                recycleViwe.adapter=CareAdapter(newData)

                return true

            }
        })





    }
}