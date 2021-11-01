package com.exmaple.myapplication

import android.os.Bundle
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import exmaple.myapplication.R

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		supportActionBar!!.hide()
		var carList = mutableListOf<Car>(
			Car(
				"Ford",
				1903,
				259.790,
				"https://www.carlogos.org/car-logos/ford-logo.png"),
			Car(
				"Mercedes Benz",
				1926,
				259.790,
				"https://logos-world.net/wp-content/uploads/2021/02/Mercedes-Benz-1926-Present.png"),
			Car(
				"Volkswagen",
				1937,
				259.790,
				"https://upload.wikimedia.org/wikipedia/commons/thumb/6/6d/Volkswagen_logo_2019.svg/1200px-Volkswagen_logo_2019.svg.png"),
			Car(
				"BMW",
				1916,
				259.790,
				"https://sportignition.com/wp-content/uploads/2019/11/Logo-BMW-300x300.png"),
			Car(
				"KIA",
				1944,
				259.790,
				"https://1000logos.net/wp-content/uploads/2021/01/logo-Kia.png"),
			Car(
				"NISSAN",
				1933,
				259.790,
				"https://www.carlogos.org/car-logos/nissan-logo-2013-700x700.png"),
			Car(
				"Lamborghini",
				1963,
				259.790,
				"https://lezebre.lu/images/detailed/17/30348-Lamborghini.png"),
		)

		var myRecyclerView = findViewById<RecyclerView>(R.id.myRecyclerView)
		GridLayoutManager(this, 2).also { myRecyclerView.layoutManager = it }
		myRecyclerView.adapter = CarAdapter(carList)
		var mSearchView = findViewById<SearchView>(R.id.mySearchView)
		mSearchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
			override fun onQueryTextSubmit(query: String?): Boolean {
				return true
			}

			override fun onQueryTextChange(newText: String?): Boolean {
				var newData = carList.filter { car: Car ->
					car.model.lowercase().contains(newText!!.lowercase())
				} as MutableList<Car>
				myRecyclerView.adapter = CarAdapter(newData)
				return true
			}

		})
	}
}