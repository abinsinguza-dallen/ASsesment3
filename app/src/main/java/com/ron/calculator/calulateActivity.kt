package com.ron.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class calulateActivity : AppCompatActivity() {
    lateinit var tilfirstNumber: TextInputLayout
    lateinit var etfirstNumber: TextInputEditText
    lateinit var tilsecondNumber: TextInputLayout
    lateinit var etsecondNumber: TextInputEditText
    lateinit var btnAddition: Button
    lateinit var btnSubtraction: Button
    lateinit var btnModulus: Button
    lateinit var btnDivision: Button
    lateinit var tvResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calulate)

        tilfirstNumber = findViewById(R.id.tilfirstNumber)
        etfirstNumber = findViewById(R.id.etfirstNumber)
        tilsecondNumber = findViewById(R.id.tilsecondNumber)
        etsecondNumber = findViewById(R.id.etsecondNumber)
        btnAddition = findViewById(R.id.btnAddition)
        btnSubtraction = findViewById(R.id.btnSubtraction)
        btnModulus = findViewById(R.id.btnmodulus)
        btnDivision = findViewById(R.id.btnDivision)
        tvResult = findViewById(R.id.tvResult)

        btnAddition.setOnClickListener { validateAddition() }
        btnSubtraction.setOnClickListener { validateAddition() }
        btnModulus.setOnClickListener { validateAddition() }
        btnDivision.setOnClickListener {  validateAddition()}

        btnAddition.setOnClickListener {
            var Number1 = etfirstNumber.text.toString().toInt()
            var Number2 = etsecondNumber.text.toString().toInt()
            getResult(Number1, Number2)


        }
        btnSubtraction.setOnClickListener {
            var Number1 = etfirstNumber.text.toString().toInt()
            var Number2 = etsecondNumber.text.toString().toInt()
            getResult2(Number1, Number2)

        }
        btnModulus.setOnClickListener {
            var Number1 = etfirstNumber.text.toString().toInt()
            var Number2 = etsecondNumber.text.toString().toInt()
            getresult3(Number2, Number1)
        }
        btnDivision.setOnClickListener {
            var Number1 = etfirstNumber.text.toString().toInt()
            var Number2 = etsecondNumber.text.toString().toInt()
            getResult4(Number1, Number2)
        }

    }

        fun getResult(Number1: Int, Number2: Int) {
            var first = Number1
            var result = first + Number2
            tvResult.text = result.toString()

        }

        fun getResult2(Number1: Int, Number2: Int) {
            var result = Number1 - Number2
            tvResult.text = result.toString()

        }

        fun getresult3(Number1: Int, Number2: Int) {
            var result = Number1 % Number2
            tvResult.text = result.toString()
        }

        fun getResult4(Number1: Int, Number2: Int) {
            var result =Number1 / Number2
            tvResult.text = result.toString()
        }

        fun validateAddition() {
            var error = false
            tilfirstNumber.error = null
            tilsecondNumber.error = null

            var fisrt= etfirstNumber.text.toString()
            if(fisrt.isBlank()) {
                etfirstNumber.error = "firstNumber is required"
                error = true
            }
            var second = etsecondNumber.text.toString()
            if (second.isBlank()) {
                etsecondNumber.error = "secondNumber is required"
                error = true
            }
            if (error != true) {

            }
        }

    }
