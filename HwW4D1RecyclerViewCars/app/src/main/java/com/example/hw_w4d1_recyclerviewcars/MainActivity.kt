package com.example.hw_w4d1_recyclerviewcars

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.GridLayoutAnimationController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var listOfCars = mutableListOf<CarModel>(
            CarModel("https://mazda.com.sa/media/bo2pidrq/cx-9_tcl4_ta1alak_46v_tc9_ext_360_48_jpg_0048.jpg","Mazda CX-9 Signature",2020,
                42.998F),
            CarModel("https://cdn.jdpower.com/ChromeImageGallery/Expanded/Transparent/640/2020JES17_640/2020JES170001_640_01.png","Jeep Renegade Latitude",2020,
                23.998F),
            CarModel("https://smartcdn.prod.postmedia.digital/driving/wp-content/uploads/2019/05/chrome-image-398956.png","Cadillac XTS Luxury ",2019,
                30.998F),
        )
        var CarRecyclerView = findViewById<RecyclerView>(R.id.cRecyclerView)
        CarRecyclerView.layoutManager = LinearLayoutManager(this)//to specify the design (make it linear)
        CarRecyclerView.adapter = CarAdapter(listOfCars) //put the list

    }
}