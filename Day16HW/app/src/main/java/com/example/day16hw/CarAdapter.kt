package com.example.day16hw

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import java.text.DecimalFormat

class CarAdapter(var data: MutableList<CarModel>): RecyclerView.Adapter<CarHolder>() {

    //Get row layout to pass to holder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarHolder {
        var rowLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_row_car, parent, false)
        return CarHolder(rowLayout)
    }

    override fun onBindViewHolder(holder: CarHolder, position: Int) {
        //Get img from URL
        Picasso.get().load(Uri.parse(data[position].imgURL)).into(holder.imgViewCarImage)
        println("img: ${data[position].imgURL}")
        //Get title
        holder.textViewCarName.text = data[position].name
        //get description
        holder.textViewCarYear.text = "Year: ${data[position].year}"
        //get year
        var formatter = DecimalFormat("#,###")
        holder.textViewCarPrice.text = "Price: ${formatter.format(data[position].price)}"
    }

    //The number of rows in the list view
    override fun getItemCount() = data.size
}

class CarHolder(v: View): RecyclerView.ViewHolder(v) {
    //list_row_list components
    var imgViewCarImage = v.findViewById<ImageView>(R.id.imageViewCarImage)
    var textViewCarName = v.findViewById<TextView>(R.id.textViewCarName)
    var textViewCarPrice = v.findViewById<TextView>(R.id.textViewCarPrice)
    var textViewCarYear = v.findViewById<TextView>(R.id.textViewCarYear)

}