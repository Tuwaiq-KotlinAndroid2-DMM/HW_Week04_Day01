package com.twq.carhw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.twq.carhw.Model.Car

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myRecyclerView=findViewById<RecyclerView>(R.id.RecyclerViewCar)
        var carList= mutableListOf<Car>(Car("Ford Expedition", 206000F,2021,"https://ymimg1.b8cdn.com/resized/car_model/6551/pictures/6209017/webp_listing_main_01.webp"),
            Car("BMW", 406000F,2021,"https://ymimg1.b8cdn.com/resized/car_model/6472/pictures/6208044/webp_listing_main_7_logo.webp"),
            Car("Kia", 56000F,2018,"https://s3.eu-central-1.amazonaws.com/v3-ncg.motory.com/vehicle-new/800x600/l-1605501507.8872-5fb20243d89c2.webp"),
            Car("Lamborghini", 953000F,2021,"https://ymimg1.b8cdn.com/resized/car_model/6259/pictures/6205199/webp_listing_main_listing_main_Lamborghini_Huracan_Evo__1_.webp"))

        myRecyclerView.layoutManager=LinearLayoutManager(this)
        myRecyclerView.adapter= CarAdapter(carList)
    }
}