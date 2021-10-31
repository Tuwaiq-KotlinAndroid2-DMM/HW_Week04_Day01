package com.example.oct31hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var movieList = mutableListOf<car>(
            car(
                "Honda Civic",
                "2021",
                90000,
                "https://en.wikipedia.org/wiki/Honda_Civic#/media/File:Brazilian_Honda_Civic_touring_2017_(cropped).jpg"
            ),
            car(
                "The Godfather",
                "2020",
                130000,
                "https://en.wikipedia.org/wiki/Honda_Accord#/media/File:2018_Honda_Accord_front_4.1.18.jpg"
            ),
            car(
                "Honda CR-V",
                "2021",
                145000,
                "https://en.wikipedia.org/wiki/Honda_CR-V#/media/File:2018_Honda_CR-V_(RW_MY18)_+Sport_2WD_wagon_(2018-10-22)_01.jpg"

            ),
   
}