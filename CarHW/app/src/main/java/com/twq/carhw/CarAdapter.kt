package com.twq.carhw

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.twq.carhw.Model.Car

class CarAdapter (var data:MutableList<Car>): RecyclerView.Adapter<MovieHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieHolder {
        var v= LayoutInflater.from(parent.context).inflate(R.layout.car_list,parent,false)
        return MovieHolder(v)
    }

    override fun onBindViewHolder(holder: MovieHolder, position: Int) {
        holder.textViewCarName.text=data[position].name
        holder.textViewCarPrice.text=data[position].price.toString()
        holder.textViewCarYear.text=data[position].year.toString()
        Picasso.get().load(data[position].imagURL).into(holder.imageViewCar)

    }

    override fun getItemCount(): Int {
        return data.size
    }
}

class MovieHolder(v : View): RecyclerView.ViewHolder(v){
    var imageViewCar=v.findViewById<ImageView>(R.id.imageViewCar)
    var textViewCarName=v.findViewById<TextView>(R.id.textViewCarName)
    var textViewCarPrice=v.findViewById<TextView>(R.id.textViewCarPrice)
    var textViewCarYear=v.findViewById<TextView>(R.id.textViewCarYear)
}