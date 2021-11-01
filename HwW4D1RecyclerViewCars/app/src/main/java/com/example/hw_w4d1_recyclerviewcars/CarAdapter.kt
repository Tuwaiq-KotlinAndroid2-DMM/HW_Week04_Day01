package com.example.hw_w4d1_recyclerviewcars

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class CarAdapter(var data:MutableList<CarModel>):RecyclerView.Adapter<CarHolder>() {

    //to convert the XML (cars_row_model.xml) to java object (view) using layoutInflater
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarHolder {
        var layoutInflater = LayoutInflater.from(parent.context).inflate(R.layout.cars_row_model,parent,false)
        return CarHolder(layoutInflater)

    }

    //(Link) to bind the data (CareHolder) and put it in the view(onCreateViewHolder)
    override fun onBindViewHolder(holder: CarHolder, position: Int) {

        Picasso.get().load(data[position].CarImgUrl).into(holder.imageViewCarImage)
        holder.textViewCarName.text = data[position].Name
        holder.textViewYear.text = "Year: "+data[position].Year.toString()
        holder.textViewCarPrice.text ="Price: " +data[position].Price.toString()+"$"
    }

    override fun getItemCount(): Int {
        return data.size
    }
}



// view holder it will do encapsulation for all data i want to be viwed
//it will represent all the data in the row(Car name, year,image,pric)
class CarHolder(v:View):RecyclerView.ViewHolder(v){

    var textViewCarName = v.findViewById<TextView>(R.id.textViewCarName)
    var textViewYear = v.findViewById<TextView>(R.id.textViewYear)
    var imageViewCarImage = v.findViewById<ImageView>(R.id.imageViewCarImage)
    var textViewCarPrice = v.findViewById<TextView>(R.id.textViewCarPrice)


}