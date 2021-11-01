package com.tuwaq.carrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class CarModel (var name: String, var price:Float, var year:Int, var imagURL:String)


class CarAdapter (var data:MutableList<CarModel>): RecyclerView.Adapter<carHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): carHolder {
        var v= LayoutInflater.from(parent.context).inflate(R.layout.car_list,parent,false)
        return carHolder(v)
    }

    override fun onBindViewHolder(holder: carHolder, position: Int) {
        holder.textViewCarName.text=data[position].name
        holder.textViewCarPrice.text=data[position].price.toString()
        holder.textViewCarYear.text=data[position].year.toString()
        Picasso.get().load(data[position].imagURL).into(holder.imageViewCar)

    }

    override fun getItemCount(): Int {
        return data.size
    }
}



class carHolder(v : View): RecyclerView.ViewHolder(v){
    var imageViewCar=v.findViewById<ImageView>(R.id.imageViewCar)
    var textViewCarName=v.findViewById<TextView>(R.id.textViewCarName)
    var textViewCarPrice=v.findViewById<TextView>(R.id.textViewCarPrice)
    var textViewCarYear=v.findViewById<TextView>(R.id.textViewCarYear)
}