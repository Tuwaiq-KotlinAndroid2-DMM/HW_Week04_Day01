package com.alidevs.carsales

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val carsArray = arrayOf(
			CarModel("Model 3",
				"Tesla",
				60000.0,
				2016,
				"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/tesla-model-3-white-1565731697.jpg"),
			CarModel("Model X",
				"Tesla",
				75000.0,
				2020,
				"https://www.zerocar.ca/wp-content/uploads/CarRentalGallery/model-x.png"),
			CarModel("Model Y",
				"Tesla",
				67000.0,
				2018,
				"https://www.tesla.com/ownersmanual/modely/ar_jo/GUID-1F2D8746-336F-4CF9-9A04-F35E960F31FE-online.png"),
			CarModel("Model S",
				"Tesla",
				67000.0,
				2019,
				"https://www.motortrend.com/uploads/bg-index/2020-tesla-models.png"),
		)

		val carsRecyclerView = findViewById<RecyclerView>(R.id.carsRecyclerView)
		carsRecyclerView.layoutManager = LinearLayoutManager(this)
		val carsRecyclerAdapter = CarsRecyclerAdapter(carsArray)
		carsRecyclerView.adapter = carsRecyclerAdapter
	}
}