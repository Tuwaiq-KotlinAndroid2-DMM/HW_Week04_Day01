package com.example.carhw

import java.io.Serializable

class Car (
    var brand:String,
    var model:String,
    var Year:Int,
    var price:Int,
    var ImageUrl:String,

): Serializable
{
    var details:String=""

}

