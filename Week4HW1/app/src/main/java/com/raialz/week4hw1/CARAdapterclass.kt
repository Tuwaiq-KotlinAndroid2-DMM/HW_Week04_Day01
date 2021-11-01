package com.raialz.week4hw1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class CARAdapterclas(var data:MutableList<CAR>): RecyclerView.Adapter<MoveHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):MoveHolder{
        var v= LayoutInflater.from(parent.context).inflate(R.layout.modlecar,parent,false)
        return MoveHolder(v)
    }


    override fun onBindViewHolder(holder: com.raialz.week4hw1.MoveHolder, position: Int) {
        holder.TextViewDescription.text=data[position].desciption
        holder. textViewName.text=data[position].name
        holder.TextViewPrice.text=data[position].price.toString()
        Picasso.get().load(data[position].imgUrl).into(holder.ImageViewPoster)

    }

    override fun getItemCount(): Int {
        return data.size
    }


}

class MoveHolder (v: View) : RecyclerView.ViewHolder(v){
    var ImageViewPoster =v.findViewById<ImageView>(R.id.imageViewposter)
    var textViewName=v.findViewById<TextView>(R.id.textViewName)
    var TextViewPrice=v.findViewById<TextView>(R.id.TextViewPrice)
    var TextViewDescription=v.findViewById<TextView>(R.id.TextViewDescription)


}