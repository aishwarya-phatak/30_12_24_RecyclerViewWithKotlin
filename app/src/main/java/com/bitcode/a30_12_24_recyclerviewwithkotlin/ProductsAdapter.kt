package com.bitcode.a30_12_24_recyclerviewwithkotlin

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductsAdapter(var products : ArrayList<Product>) :
    RecyclerView.Adapter<ProductsAdapter.ProductViewHolder>() {

    inner class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private lateinit var txtViewProductTitle : TextView
        private lateinit var txtViewProductPrice : TextView
        private lateinit var imgView1 : ImageView

        init {
              txtViewProductTitle = itemView.findViewById(R.id.txtViewProductTitle)
              txtViewProductPrice = itemView.findViewById(R.id.txtViewProductPrice)
              imgView1 = itemView.findViewById(R.id.imgView1)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val productView = layoutInflater.inflate(R.layout.product_view_holder,null)

        return ProductViewHolder(productView)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
          var product = products[position]
          var txtViewProductTitle = holder.itemView.findViewById<TextView>(R.id.txtViewProductTitle)
          txtViewProductTitle.text = product.productTitle
//          txtViewProductTitle.setOnClickListener()

          holder.itemView.findViewById<TextView>(R.id.txtViewProductPrice).text = "" + product.productPrice


          holder.itemView.findViewById<ImageView>(R.id.imgView1).setImageResource(R.drawable.ic_launcher_background)
    }

    override fun getItemCount(): Int {
        return products.size
    }
}