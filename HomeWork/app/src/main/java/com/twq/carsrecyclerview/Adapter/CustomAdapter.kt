package com.twq.carsrecyclerview.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.twq.carsrecyclerview.Model.Car
import com.twq.carsrecyclerview.R

class CustomAdapter (var data: MutableList<Car>):RecyclerView.Adapter<CarHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarHolder {
        // inflate raw
        var v = LayoutInflater.from(parent.context).inflate(R.layout.car_raw,parent,false)

        return CarHolder(v)
    }

    override fun onBindViewHolder(holder: CarHolder, position: Int) {
        // link data to raw
        holder.textViewCar.text = data[position].name
        holder.textViewPrice.text = data[position].price.toString()
        holder.textViewYear.text = data[position].year.toString()
        Picasso.get().load(data[position].imgURL).into(holder.imgViewCar)

    }

    override fun getItemCount(): Int {
       return data.size
    }

}


class CarHolder (v: View):RecyclerView.ViewHolder(v){
    var textViewCar = v.findViewById<TextView>(R.id.textViewCarNameRaw)
    var textViewPrice = v.findViewById<TextView>(R.id.textViewPriceRow)
    var textViewYear = v.findViewById<TextView>(R.id.textViewYearRaw)
    var imgViewCar = v.findViewById<ImageView>(R.id.imageViewCarRaw)


}