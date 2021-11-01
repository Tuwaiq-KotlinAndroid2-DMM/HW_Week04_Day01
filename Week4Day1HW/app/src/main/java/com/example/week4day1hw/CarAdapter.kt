package com.example.week4day1hw

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class CarAdapter(var data: MutableList<Car>) : RecyclerView.Adapter<CarHolder>() {
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarHolder {
        var v = LayoutInflater.from(parent.context).inflate(R.layout.cars_list, parent, false)
        return CarHolder(v)
    }

    override fun onBindViewHolder(holder: CarHolder, position: Int) {
        holder.textViewCarName.text = data[position].name
        holder.textViewPriceNum.text = data[position].price.toString()
        holder.textViewYearNum.text = data[position].year.toString()
        Picasso.get().load(data[position].imageURL).into(holder.imageViewCar)


    }

    override fun getItemCount(): Int {
        return data.size
    }
}


class CarHolder(v: View) : RecyclerView.ViewHolder(v) {


    var textViewCarName = v.findViewById<TextView>(R.id.textViewCarName)
    var imageViewCar = v.findViewById<ImageView>(R.id.imageViewCar)

    // var textViewPrice = v.findViewById<TextView>(R.id.textViewPrice)
    var textViewPriceNum = v.findViewById<TextView>(R.id.textViewPriceNum)

    // var textViewYear = v.findViewById<TextView>(R.id.textViewYear)
    var textViewYearNum = v.findViewById<TextView>(R.id.textViewYearNum)


}