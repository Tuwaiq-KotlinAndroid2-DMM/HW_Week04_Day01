package com.example.hwcardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide()

        var MyRecyclerView=findViewById<RecyclerView>(R.id.RecyclerView)

        var Carlist= mutableListOf<Car>(

            Car("BMW",2020,40000,"https://images.netdirector.co.uk/gforces-auto/image/upload/w_417,h_313,q_auto,c_fill,f_auto,fl_lossy/auto-client/440886d203f777101a9a4dd866ced39f/a0284342.jpg"),
            Car ("TOYOTA",2019,50000,"https://t1-cms-1.images.toyota-europe.com/toyotaone/euen/toyota-camry-2021-gallery-01-full_tcm-11-2203475.jpg"),
            Car("LEXUS",2021,500000,"https://www.lexus.com.sa/-/media/lexus/homepage-slider-media/lexus-lx-2021.jpg?h=1105&iar=0&w=1920&hash=BDC3D75684F04D476248ED7D08E1D8E3" ),
            Car("mercedes",2021,60000,"https://www.mercedes-benz-mena.com/ar/passengercars/mercedes-benz-cars/models/gle/coupe-c167/explore/highlights/_jcr_content/contentgallerycontainer/par/contentgallery/par/contentgallerytile_58586423/image.MQ6.8.20191119092227.jpeg")



            )



        MyRecyclerView.layoutManager= LinearLayoutManager(this)

        MyRecyclerView.adapter=CarAdapter(Carlist)

}}





