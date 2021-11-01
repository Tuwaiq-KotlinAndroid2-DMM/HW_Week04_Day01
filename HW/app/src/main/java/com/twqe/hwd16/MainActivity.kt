package com.twqe.hwd16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()
var carsList=mutableListOf<Cars>(
Cars("BMW",39750,"BMW X1","https://syarahcdn.syarah.com/online/posts/79792/0x300/orignal-1626215436-704.jpg"),
Cars("Audi",3950,"A6 2018","https://syarahcdn.syarah.com/online/posts/97436/0x300/orignal-1633428281-245.jpg"),
Cars("Hyundai",38800,"GL 2018","https://syarahcdn.syarah.com/online/posts/95562/0x300/orignal-1632727986-481.jpg"),
Cars("Mercedes",211500,"S 400 2015","https://syarahcdn.syarah.com/online/posts/95626/0x300/orignal-1622898513-942.jpg"),


)

        var recyclerView=findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=carAdapter(carsList)


    }
}