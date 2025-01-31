package com.bitcode.a30_12_24_recyclerviewwithkotlin

import java.io.Serializable

//model class
class Product(
    var productId : Int,
    var productTitle : String,
    var productImageId : Int,
    var productPrice : Int
) : Serializable{

}