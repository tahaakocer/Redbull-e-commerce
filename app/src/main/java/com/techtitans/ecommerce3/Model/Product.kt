package com.techtitans.ecommerce3.Model

data class Product(
    val id: Int,
    val title: String,
    val description: String,
    val price: Double,
    val discountPercentage: Double,
    val rating: Double,
    val stock: Int,
    val brand: String,
    val thumbnail: String,
    val sellerName: String,
    val sellerTell: String,
    val categoryId: Int,
)
