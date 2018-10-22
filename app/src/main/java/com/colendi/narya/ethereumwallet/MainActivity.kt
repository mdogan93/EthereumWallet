package com.colendi.narya.ethereumwallet

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.colendi.narya.ethereumwallet.R.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        print("here")

        updateTextButton.setOnClickListener { welcomeTextView.text = "Hello Kotlin World!" }

    }

}