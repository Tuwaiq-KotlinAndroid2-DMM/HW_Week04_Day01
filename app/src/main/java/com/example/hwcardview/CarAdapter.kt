package com.example.hwcardview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class CarAdapter (var data:MutableList<Car>):RecyclerView.Adapter<CarHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarHolder {
        var layoutflater=LayoutInflater.from(parent.context).inflate(R.layout.list_car , parent,false)
        return CarHolder(layoutflater)
    }

    override fun onBindViewHolder(holder: CarHolder, position: Int) {
        holder.CarName.text=data[position].Name
        holder.ViewPrice.text=data[position].Price.toString()
        holder.ViewYear.text=data[position].year.toString()
        Picasso.get().load(data[position].ImagURL).into(holder.imageCar)

    }

    override fun getItemCount(): Int {
        return data.size
    }

}

//step """"" 2.1 """"
class CarHolder(v:View):RecyclerView.ViewHolder(v){
    var CarName=v.findViewById<TextView>(R.id.textViewCarName)
    var imageCar=v.findViewById<ImageView>(R.id.imageViewCar)
    var ViewPrice=v.findViewById<TextView>(R.id.textViewPrice)
    var ViewYear=v.findViewById<TextView>(R.id.textViewYear)

}



