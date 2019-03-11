package com.lycansoft.landmarkbook

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class Detail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val intent=intent
        val name=intent.getStringExtra("name")

        val chosenImg=Globals.Chosen
        val image=chosenImg.returnImg()

        imvDetail.setImageBitmap(image)

        txvTitle.text=name
    }
}
