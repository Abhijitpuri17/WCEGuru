package com.example.wceguru.views.activities

import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

open class BaseActivity : AppCompatActivity() {

    protected fun gradientToText(tv: TextView, startColor: String, endColor:String){

        val shader = LinearGradient(
            0f,0f,0f,tv.height.toFloat(),
            intArrayOf(
                Color.parseColor(startColor),
                Color.parseColor(endColor)),
            null, Shader.TileMode.REPEAT
        )

        tv.paint.shader = shader
    }
}