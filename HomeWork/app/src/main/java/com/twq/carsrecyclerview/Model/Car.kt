package com.twq.carsrecyclerview.Model

import java.io.Serializable

data class Car(
    var name: String,
    var imgURL: String,
    var price: Int,
    var year: Int
): Serializable{

}
