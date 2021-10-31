package com.example.oct31hw

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MoveAdapter(var data:MutableList<car>):RecyclerView.Adapter<CarHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarHolder {
        var b=LayoutInflater.from(parent.context).inflate(R.layout.list_row,parent,false)
        return CarHolder(b)
    }

    override fun onBindViewHolder(holder: CarHolder, position: Int) {

        holder.textViewCarName.text=data[position].name
        holder.imageViewCarPic.text=data[position].year
        holder.textViewPrice.=data[position].p.toString()
        Picasso.get().load(data[position].imageurl).into(holder.ImageViewPoster)
    }

    override fun getItemCount(): Int {
        return data.size
    }

}
class CarHolder(b: View) : RecyclerView.ViewHolder(b){
    var textViewCarName =b.findViewById<TextureView>(R.id.textView)
    var imageViewCarPic = b.findViewById<ImageView>(R.id.imageViewCarPic)
    var textViewPrice = b.findViewById<TextView>(R.id.textViewYear)
    var textViewYear = b.findViewById<TextView>(R.id.textViewPrice)
}
