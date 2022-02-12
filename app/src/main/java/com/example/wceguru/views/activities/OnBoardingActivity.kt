package com.example.wceguru.views.activities

import android.os.Bundle
import android.widget.TextView
import com.example.wceguru.R

class OnBoardingActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        val connectTV = findViewById<TextView>(R.id.tv_connect_text)

        gradientToText(connectTV, "#FDA116", "#F9F999")

    }

}