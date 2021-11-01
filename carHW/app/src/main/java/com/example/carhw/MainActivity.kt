package com.example.carhw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val car2 = R.drawable.car2
        setContentView(R.layout.activity_splash1)
        var imageView=findViewById<ImageView>(R.id.imageView)
        imageView.setImageResource(car2)
        Handler().postDelayed({
            var intent= Intent(this,ActivityItem::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}