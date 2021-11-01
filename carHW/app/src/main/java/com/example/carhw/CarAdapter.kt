package com.example.carhw

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class CarAdapter(var data:MutableList<Car>): RecyclerView.Adapter<CarHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarHolder {
        var v= LayoutInflater.from(parent.context).inflate(R.layout.list_row,parent,false)
        return CarHolder(v)
    }

    override fun onBindViewHolder(holder: CarHolder, position: Int) {

        holder.textViewbrand.text=data[position].brand
        holder.textViewModel.text=data[position].model
        holder.textViewYear.text=data[position].Year.toString()
        holder.textViewPrice.text=data[position].price.toString()
        Picasso.get().load(data[position].ImageUrl).into(holder.imageViewCar)
        holder.itemView.setOnClickListener{
            println(data[position].model)
            var intent= Intent(holder.itemView.context,MainActivity2::class.java)
            var m=data[position]
            m.details="A car is a wheeled motor vehicle used for transportation. Most definitions of cars say that they run primarily on roads, seat one-to-eight people, have four wheels and mainly transport people rather than goods"

            intent.putExtra("Car",data[position])
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

}
class CarHolder(v: View) : RecyclerView.ViewHolder(v){
    var imageViewCar =v.findViewById<ImageView>(R.id.imageViewCar)
    var textViewModel = v.findViewById<TextView>(R.id.textViewModel)
    var textViewYear = v.findViewById<TextView>(R.id.textViewYear)
    var textViewPrice = v.findViewById<TextView>(R.id.textViewPrice)
    var textViewbrand = v.findViewById<TextView>(R.id.textViewbrand)
}