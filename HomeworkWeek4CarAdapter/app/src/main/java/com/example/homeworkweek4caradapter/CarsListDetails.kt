package com.example.homeworkweek4caradapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso



class CarsListDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.car_details)


        var cars=intent.getSerializableExtra("cars")as Cars
        var imageViewCarsPic=findViewById<ImageView>(R.id.imageViewCarPoster)
        var textViewName=findViewById<TextView>(R.id.textViewCarNameBig)
        var textVIewPrice=findViewById<TextView>(R.id.textViewCarPriceBig)
        var textViewYear=findViewById<TextView>(R.id.textViewCarYearBig)

        textViewName.text=cars.name
        textVIewPrice.text=cars.price.toString()
        textViewYear.text=cars.year.toString()


        Picasso.get().load(cars.imageUrl).into(imageViewCarsPic)




    }
}