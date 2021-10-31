package com.example.week4_day1_hw

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class CarAdapter(var data:MutableList<Car>):RecyclerView.Adapter<CarHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarHolder {
        var v = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_row_car,parent,false)

        return CarHolder(v)
    }

    override fun onBindViewHolder(holder: CarHolder, position: Int) {
        holder.nameTextView.text=data[position].name
        holder.priceTextView.text=data[position].price.toString()
        holder.yearTextView.text=data[position].year.toString()
        Picasso.get().load(data[position].imageUrl).into(holder.postImageView)


    }

    override fun getItemCount(): Int {
         return data.size
    }
}


class CarHolder(v:View ):RecyclerView.ViewHolder(v){
    var nameTextView= v.findViewById<TextView>(R.id.textViewCarName)
    var priceTextView = v.findViewById<TextView>(R.id.textViewPrice)
    var yearTextView = v.findViewById<TextView>(R.id.textViewYear)
    var postImageView = v.findViewById<ImageView>(R.id.imageViewCar)

}