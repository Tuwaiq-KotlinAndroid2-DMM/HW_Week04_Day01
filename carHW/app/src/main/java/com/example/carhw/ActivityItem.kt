package com.example.carhw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ActivityItem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var CarList = mutableListOf<Car>(
            Car("Mercedes", "GLE Coupe", 2021,260000,"https://media.ed.edmunds-media.com/mercedes-benz/gle-class-coupe/2021/oem/2021_mercedes-benz_gle-class-coupe_4dr-suv_amg-gle-53_fq_oem_1_815.jpg" ),
            Car("BMW", "X6", 2020,240000,"https://saudiauto.com.sa/uploads/19/07/aya/2020-bmw-x6.jpg"),
            Car("Toyota", "Camry", 2020,200000 ,"https://qiyada.me/wp-content/uploads/2019/09/2020-toyota-camry-trd.jpg"),
            Car("Mazda", "6", 2018,120000 ,"https://i.ytimg.com/vi/z3GrFfU-YpY/maxresdefault.jpg"),
            Car("Tesla", "Model S", 2020,300000,"https://media.ed.edmunds-media.com/tesla/model-s/2019/oem/2019_tesla_model-s_sedan_performance_fq_oem_1_1600.jpg"),
            Car("Pourche", "Carera", 2020, 450000,"https://mallaky.com/Media/up/2019-7/Porsche%20911%20Carrera%202020-1.jpg"),
            Car("Masarati", "M1", 2020, 500000,"https://i.pinimg.com/originals/f7/44/d3/f744d3f353ff3bfb97cec822ea17f90a.png"),
            Car("Hyundai", "GLS", 2020, 110000,"https://media.hatla2eestatic.com/uploads/ncarmodel/7501/big-up_577f40b6f8bd52af6df3fd0111fc5869.jpg"),
            )


        var recycleViewCar = findViewById<RecyclerView>(R.id.recycleViewCar)
        recycleViewCar.layoutManager = LinearLayoutManager(this)
        recycleViewCar.adapter = CarAdapter(CarList)


        var cSearchView = findViewById<androidx.appcompat.widget.SearchView>(R.id.searchViewCar)
       cSearchView.setOnQueryTextListener(object : androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {

                var newData = CarList.filter { car: Car -> car.model.toLowerCase().contains(newText!!.toLowerCase()) } as MutableList<Car>
                recycleViewCar.adapter = CarAdapter(newData)
                return true
            }

        })
    }
}