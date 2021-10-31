package com.example.hw_week4_day1_solution

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recyclerviewer)


        var itemList = mutableListOf<Item>(
            Item(
                "Vanilla",
                "Ariose means having a melody, we just wish that everyone could enjoy a relaxed bathing time after hard day work. ArioseMonde is committed to bring you intimate peace of mind and comfort.",
                5.0,
                "https://m.media-amazon.com/images/I/91olmHeBQgL._SL1500_.jpg"
            ),
            Item(
                "Elegant Freesia",
                "Ariose means having a melody, we just wish that everyone could enjoy a relaxed bathing time after hard day work. ArioseMonde is committed to bring you intimate peace of mind and comfort.",
                4.4,
                "https://m.media-amazon.com/images/I/81dYK-C3LNL._SL1301_.jpg"
            ),

            Item(
                "Vanilla & Coconut",
                "Ariose means having a melody, we just wish that everyone could enjoy a relaxed bathing time after hard day work. ArioseMonde is committed to bring you intimate peace of mind and comfort.",
                4.5,
                "https://m.media-amazon.com/images/I/81bfbN1USPL._SL1500_.jpg"
            ),
            Item(
                "Honey & Almond",
                "Ariose means having a melody, we just wish that everyone could enjoy a relaxed bathing time after hard day work. ArioseMonde is committed to bring you intimate peace of mind and comfort.",
                4.7,
                "https://m.media-amazon.com/images/I/91UbPqgGcTL._SL1500_.jpg"
            ),
            Item(
                "Jasmine",
                "Ariose means having a melody, we just wish that everyone could enjoy a relaxed bathing time after hard day work. ArioseMonde is committed to bring you intimate peace of mind and comfort.",
                4.9,
                "https://m.media-amazon.com/images/I/71JFb6ewlNL._SL1101_.jpg"
            ),

            )


        var RecyclerViewOfItems = findViewById<RecyclerView>(R.id.RecyclerViewOfItems)

        RecyclerViewOfItems.layoutManager = LinearLayoutManager(this)

        RecyclerViewOfItems.adapter = ItemAdapter(itemList) //connect the two activities


        var SearchView = findViewById<SearchView>(R.id.SearchView)
        SearchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                var newData = itemList.filter { item: Item ->
                    item.Name.toLowerCase().contains(newText!!.toLowerCase())
                } as MutableList<Item>

                RecyclerViewOfItems.adapter = ItemAdapter(newData)
                return true
            }


        })




    }
}
