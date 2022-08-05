package com.example.ropstamtask.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ropstamtask.MainActivity
import com.example.ropstamtask.R
import com.example.ropstamtask.interfaces.onItemClick
import com.example.ropstamtask.models.ItemsViewModel

class TrendingProductAdapter(
    var mList: ArrayList<ItemsViewModel>,
    var context: MainActivity
)  : RecyclerView.Adapter<TrendingProductAdapter.ViewHolder>() {


    var onItemClick : onItemClick? = context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.trending_product_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title_TrendingProduct.text = mList[position].title
        holder.price_TrendingProduct.text = mList[position].price
        Glide.with(context)
            .load(mList[position].image)
            .into(holder.img_TrendingProduct)
        holder.itemView.setOnClickListener{onItemClick!!.onItemClickTrendProduct(position)}
    }

    override fun getItemCount(): Int {
        return mList.size
    }


    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val img_TrendingProduct: ImageView = itemView.findViewById(R.id.img_trendingProduct)
        val title_TrendingProduct : TextView = itemView.findViewById(R.id.tv_titleItem)
        val price_TrendingProduct : TextView = itemView.findViewById(R.id.tv_priceItem)
    }
}