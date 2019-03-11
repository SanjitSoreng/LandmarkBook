package com.lycansoft.landmarkbook

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var landmarkList=ArrayList<String>()

        landmarkList.add("Taj Mahal")
        landmarkList.add("Qutb Minar")
        landmarkList.add("Red Fort")

        val taj=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.tajmahal)
        val qutb=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.qutb)
        val redfort=BitmapFactory.decodeResource(applicationContext.resources,R.drawable.redfort)

        var landmarkImages=ArrayList<Bitmap>()

        landmarkImages.add(taj)
        landmarkImages.add(qutb)
        landmarkImages.add(redfort)


        val adapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkList)
        lsvLandmarks.adapter=adapter

        lsvLandmarks.onItemClickListener=AdapterView.OnItemClickListener { parent, view, position, id ->
            val intent=Intent(applicationContext,Detail::class.java)
            intent.putExtra("name",landmarkList[position])

            val bitmap=landmarkImages[position]
            val chosenImg=Globals.Chosen
            chosenImg.chosenImage=bitmap

            startActivity(intent)
        }
    }
}
