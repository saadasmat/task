package com.example.ropstamtask

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ropstamtask.adapter.TrendingProductAdapter
import com.example.ropstamtask.interfaces.onItemClick
import com.example.ropstamtask.models.ItemsViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , onItemClick , View.OnClickListener{

    var adapter : TrendingProductAdapter? = null
    var trendingItemList : ArrayList<ItemsViewModel>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initsFun()
    }

    private fun initsFun() {
        trendingItemList = ArrayList()
        trendingItemList!!.add(ItemsViewModel(R.drawable.images,"Leather Sofa" ,"20,000"))
        trendingItemList!!.add(ItemsViewModel(R.drawable.images,"Leather Sofa" ,"20,000"))
        trendingItemList!!.add(ItemsViewModel(R.drawable.images,"Leather Sofa" ,"20,000"))
        adapter = TrendingProductAdapter(trendingItemList!!, this )
        rv_trendingProducts.setLayoutManager(
            LinearLayoutManager(
                this,
                LinearLayoutManager.HORIZONTAL,
                false
            )
        )
        rv_trendingProducts.adapter = adapter
    }

    override fun onItemClickTrendProduct(position: Int) {
        if(position == 0){
            val intent = Intent(this , ItemDetailActivity::class.java)
            intent.putExtra("position" , position)
            startActivity(intent)
        }else if(position == 1){
            val intent = Intent(this , ItemDetailActivity::class.java)
            intent.putExtra("position" , position)
            startActivity(intent)
        }else if(position == 2){
            val intent = Intent(this , ItemDetailActivity::class.java)
            intent.putExtra("position" , position)
            startActivity(intent)
        }
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}