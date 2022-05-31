package com.example.landapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.landapp.R
import com.example.landapp.R.*
import com.example.landapp.datas.Room
// mContext : 화면, resId : xml파일, mList : xml파일에 뿌려줄 배열
class RoomAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<Room>
) : ArrayAdapter<Room>(mContext, resId, mList) {

    val inflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if(tempRow == null){
            tempRow = inflater.inflate(layout.room_list_item, null)
        }

        val row = tempRow!!

        val roomData = mList[position]

        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val addressandFloorTxt = row.findViewById<TextView>(R.id.addressAndFloorTxt)
        val descriptionTxt = row.findViewById<TextView>(R.id.descriptionTxt   )

        descriptionTxt.text = roomData.description
        addressandFloorTxt.text = roomData.address
        priceTxt.text = roomData.price.toString()



        return row
    }
}