package com.example.catdogccp1

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    lateinit var bitmap :Bitmap
    lateinit var imgview :ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        imgview = findViewById(R.id.imageView)
        var tv:TextView = findViewById(R.id.textView2)
        var select:Button = findViewById(R.id.button)
        select.setOnClickListener(View.OnClickListener {
            var intent:Intent = Intent(Intent.ACTION_GET_CONTENT)
            intent.type = "image/*"
            startActivityForResult(intent, 100)
        })
    }}