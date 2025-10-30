package com.example.katalogproduk
data class Product(
    val name: String,
    val price: String,
    val description: String,
    val imageResId: Int,
    val category: ProductCategory
)

enum class ProductCategory {
    FASHION,
    ACCESSORIES,
    BEAUTY
}



