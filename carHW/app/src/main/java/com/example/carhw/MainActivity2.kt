package com.example.carhw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var car=intent.getSerializableExtra("car" )as Car
        var imageViewCar1 =findViewById<ImageView>(R.id.imageViewCar1)
        var textViewModel1 = findViewById<TextView>(R.id.textViewModel1)
        var textViewYear1 = findViewById<TextView>(R.id.textViewYear1)
        var textViewPrice1 = findViewById<TextView>(R.id.textViewPrice1)
        var textViewbrand1 = findViewById<TextView>(R.id.textViewbrand1)
        var textViewdetails1 = findViewById<TextView>(R.id.textViewdetails)

        textViewdetails1.text=car.details
        textViewModel1.text=car.model
        textViewPrice1.text=car.price.toString()
        textViewYear1.text=car.Year.toString()
        textViewbrand1.text=car.brand

    }
}