package com.exmaple.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import exmaple.myapplication.R

class CarAdapter(var data: MutableList<Car>) : RecyclerView.Adapter<CarHolder>() {
	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarHolder {
		var v = LayoutInflater.from(parent.context).inflate(R.layout.car, parent, false)
		return CarHolder(v)
	}

	override fun onBindViewHolder(holder: CarHolder, position: Int) {
		holder.textViewModel.text = data[position].model
		holder.textViewYear.text = data[position].year.toString()
		holder.textViewYear.text = data[position].year.toString()
		Picasso.get().load(data[position].link)
			.error(R.drawable.baseline_report_gmailerrorred_black_24dp).into(holder.imageViewCar)

	}

	override fun getItemCount(): Int {
		return data.size
	}

}

class CarHolder(v: View) : RecyclerView.ViewHolder(v) {
	var imageViewCar = v.findViewById<ImageView>(R.id.imageViewCar)
	var textViewModel = v.findViewById<TextView>(R.id.textViewModel)
	var textViewYear = v.findViewById<TextView>(R.id.textViewYear)
}