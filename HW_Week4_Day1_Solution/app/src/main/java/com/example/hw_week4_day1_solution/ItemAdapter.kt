package com.example.hw_week4_day1_solution


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso


class ItemAdapter(var data:MutableList<Item>):RecyclerView.Adapter<ItemHolder>() {
    //
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        var v=LayoutInflater.from(parent.context).inflate(R.layout.list_items,parent,false)
        return ItemHolder(v)
    }
    //turn the text into data
    override fun onBindViewHolder(holder: ItemHolder, position: Int) {

        holder.ProductDescription.text=data[position].Description
        holder.ProductName.text=data[position].Name
        holder.ProductRate.text=data[position].Rate.toString()

        Picasso.get().load(data[position].PicURL).into(holder.ProductImage)
        // The the other method
        holder.ProductImage.setOnClickListener {
            println(data[position].Name)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

}
class ItemHolder(v: View) : RecyclerView.ViewHolder(v){
    var ProductImage =v.findViewById<ImageView>(R.id.ProductImage)
    var ProductName = v.findViewById<TextView>(R.id.ProductName)
    var ProductRate = v.findViewById<TextView>(R.id.ProductRate)
    var ProductDescription = v.findViewById<TextView>(R.id.ProductDescription)
}
