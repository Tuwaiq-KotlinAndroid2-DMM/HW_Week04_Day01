package com.example.homeworkweek4d1

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import layout.Cars
import com.squareup.picasso.Picasso

class CarAdapter(var data:MutableList<Cars>): RecyclerView.Adapter<CarsHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarsHolder {
        var layoutInflater = LayoutInflater.from(parent.context).inflate(R.layout.cardview,parent,false)
        return CarsHolder(layoutInflater)
    }
    override fun onBindViewHolder(holder: CarsHolder, position: Int) {

        holder.textViewname.text = data[position].name
        holder.textViewPrice.text = data[position].price.toString()
        holder.textViewyear.text = data[position].year.toString()
        Picasso.get().load(data[position].PosterURL).into(holder.imageViewcars)


    }

    override fun getItemCount(): Int {
        return data.size
    }

}
class CarsHolder(v: View):RecyclerView.ViewHolder(v){
    var imageViewcars = v.findViewById<ImageView>(R.id.imageViewCar)
    var textViewyear = v.findViewById<TextView>(R.id.year)
    var textViewPrice = v.findViewById<TextView>(R.id.price)
    var textViewname = v.findViewById<TextView>(R.id.carName)

}


