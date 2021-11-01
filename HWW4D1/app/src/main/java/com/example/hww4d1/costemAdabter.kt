package com.example.hww4d1

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class CarAdapter(var data: MutableList<Car>):RecyclerView.Adapter<CarHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarHolder {
        var v=LayoutInflater.from(parent.context).inflate(R.layout.list_row_car, parent,false)
        return CarHolder(v)
    }

    override fun onBindViewHolder(holder: CarHolder, position: Int) {
        holder.textViewtitle.text=data[position].title
        holder.textViewprice.text=data[position].Price.toString()
        holder.textViewyear.text=data[position].year.toString()
        Picasso.get().load(Uri.parse(data[position].posterUrl)).into(holder.imageView)
    }

    override fun getItemCount(): Int {
        return data.size
    }}
class CarHolder(v:View):RecyclerView.ViewHolder(v){
    var imageView=v.findViewById<ImageView>(R.id.imageView)
    var textViewtitle=v.findViewById<TextView>(R.id.textViewtitle)
    var textViewprice=v.findViewById<TextView>(R.id.textViewprice)
    var textViewyear=v.findViewById<TextView>(R.id.textViewyear)
}
