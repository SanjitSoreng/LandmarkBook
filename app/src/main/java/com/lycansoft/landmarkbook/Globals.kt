package com.lycansoft.landmarkbook

import android.graphics.Bitmap

class Globals {

    companion object Chosen{

        var chosenImage:Bitmap?=null

        fun returnImg():Bitmap {
            return chosenImage!!
        }

    }
}