package com.example.katalogproduk

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = ProductAdapter(ProductData.productList) { product ->

            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("name", product.name)
            intent.putExtra("price", product.price)
            intent.putExtra("description", product.description)
            intent.putExtra("imageResId", product.imageResId)
            startActivity(intent)
        }

        recyclerView.adapter = adapter
    }

    object ProductData {
        val productList = listOf(
            Product(
                name = "Sepatu Sport X-Run",
                price = "Rp 350.000",
                description = "Sepatu sport ringan dengan sol empuk, cocok untuk lari atau jalan santai.",
                imageResId = R.drawable.sepatu,
                category = ProductCategory.FASHION
            ),
            Product(
                name = "Tas Ransel Adventure",
                price = "Rp 250.000",
                description = "Tas ransel dengan kapasitas besar, tahan air, dan cocok untuk traveling.",
                imageResId = R.drawable.tas,
                category = ProductCategory.FASHION
            ),
            Product(
                name = "Jam Tangan Classic",
                price = "Rp 180.000",
                description = "Jam tangan analog dengan desain elegan, cocok untuk kegiatan formal maupun kasual.",
                imageResId = R.drawable.jam,
                category = ProductCategory.ACCESSORIES
            ),
            Product(
                name = "Skincare Glow Serum",
                price = "Rp 120.000",
                description = "Serum wajah dengan kandungan niacinemade yang membantu mencerahkan kulit.",
                imageResId = R.drawable.skincare,
                category = ProductCategory.BEAUTY
            ),
            Product(
                name = "Kaos Oversized Unisex",
                price = "Rp 95.000",
                description = "Kaos polos oversized berbahan katun lembut dan adem, cocok untuk harian.",
                imageResId = R.drawable.baju,
                category = ProductCategory.FASHION
            )
        )
    }
}
