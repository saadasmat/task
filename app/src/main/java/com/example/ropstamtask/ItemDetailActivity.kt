package com.example.ropstamtask

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_item_detail.*

class ItemDetailActivity : AppCompatActivity() , View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_detail)
        intentPostion()
        viewClickListener()
    }

    private fun viewClickListener() {
        tv_back.setOnClickListener(this)
        tv_sizeOne.setOnClickListener(this)
        tv_sizeTwo.setOnClickListener(this)
        tv_sizeThree.setOnClickListener(this)
        tv_sizeFour.setOnClickListener(this)
    }

    private fun intentPostion() {
        if(intent.getIntExtra("position" , 0) == 0){
            img_frame.setImageResource(R.drawable.images)
        }else if(intent.getIntExtra("position" , 0) == 1){
            img_frame.setImageResource(R.drawable.images)
        }else if(intent.getIntExtra("position" , 0) == 2){
            img_frame.setImageResource(R.drawable.images)
        }
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onClick(v: View?) {
        if(v!!.id == R.id.tv_back){
            onBackPressed()
        }else if(v.id == R.id.tv_sizeOne){
            tv_sizeOne.background = resources.getDrawable(R.drawable.circle_layerlist_storke)
            tv_sizeTwo.background = resources.getDrawable(R.drawable.circle_layerlist)
            tv_sizeThree.background = resources.getDrawable(R.drawable.circle_layerlist)
            tv_sizeFour.background = resources.getDrawable(R.drawable.circle_layerlist)
        }else if(v.id == R.id.tv_sizeTwo){
            tv_sizeOne.background = resources.getDrawable(R.drawable.circle_layerlist)
            tv_sizeTwo.background = resources.getDrawable(R.drawable.circle_layerlist_storke)
            tv_sizeThree.background = resources.getDrawable(R.drawable.circle_layerlist)
            tv_sizeFour.background = resources.getDrawable(R.drawable.circle_layerlist)
        }else if(v.id == R.id.tv_sizeThree){
            tv_sizeOne.background = resources.getDrawable(R.drawable.circle_layerlist)
            tv_sizeTwo.background = resources.getDrawable(R.drawable.circle_layerlist)
            tv_sizeThree.background = resources.getDrawable(R.drawable.circle_layerlist_storke)
            tv_sizeFour.background = resources.getDrawable(R.drawable.circle_layerlist)
        }else if(v.id == R.id.tv_sizeFour) {
            tv_sizeOne.background = resources.getDrawable(R.drawable.circle_layerlist)
            tv_sizeTwo.background = resources.getDrawable(R.drawable.circle_layerlist)
            tv_sizeThree.background = resources.getDrawable(R.drawable.circle_layerlist)
            tv_sizeFour.background = resources.getDrawable(R.drawable.circle_layerlist_storke)
        }
    }
}