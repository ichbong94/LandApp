package com.example.landapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.landapp.datas.Room
import kotlinx.android.synthetic.main.view_detail_room.*

class ViewDetailRoomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_detail_room)

        val roomData = intent.getSerializableExtra("room") as Room

        priceTxt.text = roomData.price.toString()
        descriptionTxt.text = roomData.description
        addressTxt.text = roomData.address



    }
}