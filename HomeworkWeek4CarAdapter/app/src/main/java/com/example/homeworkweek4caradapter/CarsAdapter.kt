package com.example.homeworkweek4caradapter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso



        class CarAdapter (var data:MutableList<Cars>): RecyclerView.Adapter<CarsHolder>() {
            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarsHolder {
                var v=LayoutInflater.from(parent.context).inflate(R.layout.activity_cars_list_details,parent,false)
                return CarsHolder(v)
            }

            override fun onBindViewHolder(holder: CarsHolder, position: Int) {
                holder.carName.text=data[position].name
                holder.carYear.text=data[position].year.toString()
                holder.carprice.text=data[position].price.toString()
                Picasso.get().load(data[position].imageUrl).into(holder.carImage)

                holder.itemView.setOnClickListener {
                    println(data[position].name)
                    var intent=Intent(holder.itemView.context,CarsListDetails::class.java)
                    intent.putExtra("cars",data[position])
                    holder.itemView.context.startActivity(intent)

                }
            }

            override fun getItemCount(): Int {
                return data.size
            }

        }





class CarsHolder(v: View): RecyclerView.ViewHolder(v){

    var carImage=v.findViewById<ImageView>(R.id.imageViewCarPhoto)
    var carName=v.findViewById<TextView>(R.id.textViewCarName)
    var carYear=v.findViewById<TextView>(R.id.textViewCarYear)
    var carprice=v.findViewById<TextView>(R.id.textViewCarPrice)
}