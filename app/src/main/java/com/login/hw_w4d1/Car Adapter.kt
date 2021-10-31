package com.login.hw_w4d1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class CarAdapter (var data:MutableList<Car>): RecyclerView.Adapter<CarHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarHolder {
        var c= LayoutInflater.from(parent.context).inflate(R.layout.crecyclerview,parent,false)
        return CarHolder(c)

    }

    override fun onBindViewHolder(holder: CarHolder, position: Int) {
        holder.carname.text = data[position].name
        holder.carModel.text=data[position].model
        holder.carprice.text = "Price: "+data[position].price.toString()
        holder.caryear.text = "Year: "+data[position].year.toString()
        Picasso.get().load(data[position].imageView).into(holder.carimage)


    }

    override fun getItemCount(): Int {
        return data.size

    }


}

class CarHolder (v: View): RecyclerView.ViewHolder(v){
    var carname= v.findViewById<TextView>(R.id.textViewName)
    var carModel= v.findViewById<TextView>(R.id.textViewmodel)
    var caryear= v.findViewById<TextView>(R.id.textViewyear)
    var carprice= v.findViewById<TextView>(R.id.textViewprice)
    var carimage= v.findViewById<ImageView>(R.id.imageViewCar)


}


