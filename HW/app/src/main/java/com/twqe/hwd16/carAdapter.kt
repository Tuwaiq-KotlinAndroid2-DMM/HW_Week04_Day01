package com.twqe.hwd16

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class carHolder(v: View): RecyclerView.ViewHolder(v) {
var textViewCarBrand=itemView.findViewById<TextView>(R.id.textViewCarBrand)
var textViewCarPrice=itemView.findViewById<TextView>(R.id.textViewCarPrice)
var textViewCarName=itemView.findViewById<TextView>(R.id.textViewCarName)
    var imageViewCarImg=itemView.findViewById<ImageView>(R.id.imageViewCarImg)
}
class carAdapter(var data:MutableList<Cars>): RecyclerView.Adapter<carHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): carHolder {
var v = LayoutInflater.from(parent.context).inflate(R.layout.cars_row_list,parent,false)
    return carHolder(v)
    }

    override fun onBindViewHolder(holder: carHolder, position: Int) {
holder.textViewCarBrand.text=data[position].brand
        holder.textViewCarPrice.text=data[position].price.toString()
        holder.textViewCarName.text=data[position].name
        Picasso.get().load(data[position].image).into(holder.imageViewCarImg)
    }

    override fun getItemCount(): Int {
        return  data.size
    }

}