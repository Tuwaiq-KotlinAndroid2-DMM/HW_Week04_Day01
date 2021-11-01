package com.example.hww4d1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var carlist= mutableListOf<Car>(
            Car("BMW","300000 SR",2021,"https://www.rushlane.com/wp-content/uploads/2020/12/2021-bmw-3-series-gran-limousine-launch-india-price-2.jpg"),
            Car("GMC","300000 SR",2020,"https://th.bing.com/th/id/R.5c5035ed91cd52153cfc69d1f12bc185?rik=Lf9F6ZWxXhsmFQ&pid=ImgRaw&r=0"),
            Car("OPEL","300000 SR",2020,"https://th.bing.com/th/id/R.d2f4daff4db99d5603fd72a3d6f80c25?rik=UtIjfeHBs44GaA&riu=http%3a%2f%2fmotori.ilgiornale.it%2fwp-content%2fuploads%2f2020%2f10%2fop1.jpg&ehk=FwZWDPjB6Zl47Dwtd6pSLnUYefv5N2nHos3T4ANJ70g%3d&risl=&pid=ImgRaw&r=0"),
            Car("VOLVO","300000 SR",2021,"https://cms.autoscout24.ch/media/18830/volvo-v60-t6-2018-09.jpg"),
            Car("KIA","300000 SR",2021,"https://th.bing.com/th/id/R.a4d9040dc60cccd9f5cec2bd8eb9e2d0?rik=2dvT5ttL5kddXA&pid=ImgRaw&r=0"),
            Car("DODGE","300000 SR",2020,"https://th.bing.com/th/id/R.a18d565d174b4fdfaa87a3d979e9dec8?rik=2XRmeTeGztWo7A&pid=ImgRaw&r=0"),
            Car("FORD","300000 SR",2022,"https://www.ouestfrance-auto.com/sites/default/files/web-2224_0.jpg"),
            Car("TOYOTA","300000 SR",2020,"https://img-ik.cars.co.za/images/2020/4/Fortuner-Epic/tr:n-news_1200x/Toyota-Fortuner-Epic-5.jpg"),
            Car("HONDA","300000 SR",2022,"https://th.bing.com/th/id/R.19bcaf79fec1347215df42435e9eb606?rik=04bTcKzTc39uJQ&pid=ImgRaw&r=0"),
            Car("FERRARI","300000 SR",2021,"https://th.bing.com/th/id/R.e44f850dda98fe93a70cda4efd69af83?rik=vLeY74DgJeSA1Q&pid=ImgRaw&r=0"),
            Car("TSKODA","300000 SR",2022,"https://th.bing.com/th/id/R.cb3d54c404b61823663c98fd1923be8b?rik=XEKGjt9M6m76Bw&pid=ImgRaw&r=0"),
            Car("MERCEDES","300000 SR",2020,"https://th.bing.com/th/id/R.536b70c31841a27fb5adcb444769106a?rik=QA09f62kogzSfA&pid=ImgRaw&r=0"),
            Car("JAGUAR","300000 SR",2022,"https://www.autocar.co.uk/sites/autocar.co.uk/files/images/car-reviews/first-drives/legacy/jag-news-1842.jpg"),
            Car("JEEP","300000 SR",2021,"https://th.bing.com/th/id/R.457e6cb5f8f660591ea17d2ae3947301?rik=UICFpYSA4bLCzg&riu=http%3a%2f%2fwww.marinoperformancemotors.com%2fimagetag%2f13485%2f12%2fl%2fUsed-2016-Jeep-Wrangler-Unlimited-Sahara.jpg&ehk=NfYBU0EAdJ3D4Qm7OqWijLUPcWNdn4dYSU6e6CjbpCE%3d&risl=&pid=ImgRaw&r=0"),

            )
        var recyclerview=findViewById<RecyclerView>(R.id.recyclerview)
        recyclerview.layoutManager= LinearLayoutManager(this)
        recyclerview.adapter=CarAdapter(carlist)
        var searchView=findViewById<SearchView>(R.id.searchView)
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                var newData=carlist.filter { car: Car -> car.title.toLowerCase().contains(newText!!.toLowerCase())} as MutableList<Car>
                recyclerview.adapter = CarAdapter(newData)
                return true

            }


        })

    }
}