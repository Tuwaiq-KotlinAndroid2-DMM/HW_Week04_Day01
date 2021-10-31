package com.alidevs.carsales

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BrandsRecyclerAdapter(var brandsList: Array<BrandModel>): RecyclerView.Adapter<BrandsRecyclerAdapter.ViewHolder>() {

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
		val v = LayoutInflater.from(parent.context).inflate(R.layout.brand_cell, parent, false)
		return ViewHolder(v)
	}

	override fun onBindViewHolder(holder: ViewHolder, position: Int) {
		holder.bindItems(brandsList[position])
	}

	override fun getItemCount(): Int {
		return brandsList.size
	}

	inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
		fun bindItems(brand: BrandModel) {
			val brandLogoImageView = itemView.findViewById<ImageView>(R.id.brandLogoImageView)
			val brandNameTextView = itemView.findViewById<TextView>(R.id.brandNameTextView)

			brandNameTextView.text = brand.name
		}
	}
}