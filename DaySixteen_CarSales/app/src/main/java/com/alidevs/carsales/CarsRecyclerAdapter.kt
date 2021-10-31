package com.alidevs.carsales

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class CarsRecyclerAdapter(var carsList: Array<CarModel>) : RecyclerView.Adapter<CarsRecyclerAdapter.ViewHolder>() {

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
		val v = LayoutInflater.from(parent.context).inflate(R.layout.car_row, parent, false)
		return ViewHolder(v)
	}

	override fun onBindViewHolder(holder: ViewHolder, position: Int) {
		holder.bindViews(carsList[position])
	}

	override fun getItemCount(): Int {
		return carsList.size
	}

	inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

		fun bindViews(car: CarModel) {
			val imageView = itemView.findViewById<ImageView>(R.id.carImageView)
			val modelTextView = itemView.findViewById<TextView>(R.id.rowModelTextView)
			val manufacturerTextView = itemView.findViewById<TextView>(R.id.rowManufacturerTextView)
			val yearTextView = itemView.findViewById<TextView>(R.id.rowYearTextView)
			val priceTextView = itemView.findViewById<TextView>(R.id.rowPriceTextView)

			Picasso.get().load(car.imageUrl).into(imageView)
			manufacturerTextView.text = car.manufacturer
			modelTextView.text = car.model
			yearTextView.text = car.year.toString()
			priceTextView.text = "$${car.price}"
		}
	}
}