package com.ron.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btncalculator:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btncalculator=findViewById(R.id.btncalculaotor)
        btncalculator.setOnClickListener {
            var intent=Intent(this,calulateActivity::class.java)
            startActivity(intent)
        }

    }
}