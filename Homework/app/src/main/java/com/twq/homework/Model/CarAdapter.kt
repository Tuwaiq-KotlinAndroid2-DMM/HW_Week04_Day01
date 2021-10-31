package com.twq.homework.Model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.twq.homework.R

class CarAdapter (var data:MutableList<Car>):RecyclerView.Adapter<CarHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarHolder {
        var v = LayoutInflater.from(parent.context).inflate(R.layout.row_cars,parent,false)
        return CarHolder(v)
    }

    override fun onBindViewHolder(holder: CarHolder, position: Int) {
        holder.carName.text = data[position].carName
        holder.carPrice.text = "Price: "+data[position].carPrice.toString()
        holder.carYear.text = "Year: "+data[position].carYear.toString()
        Picasso.get().load(data[position].carImage).into(holder.carImage)

    }

    override fun getItemCount(): Int {
        return data.size
    }


}
class CarHolder(v: View):RecyclerView.ViewHolder(v){
    var carName = v.findViewById<TextView>(R.id.textViewCarName)
    var carYear = v.findViewById<TextView>(R.id.textViewCarYear)
    var carPrice = v.findViewById<TextView>(R.id.textViewCarPrice)
    var carImage = v.findViewById<ImageView>(R.id.imageViewCar)

}