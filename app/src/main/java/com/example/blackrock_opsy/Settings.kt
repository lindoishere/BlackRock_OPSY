package com.example.blackrock_opsy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView

class Settings : AppCompatActivity() {

    private lateinit var editTextNumber: EditText
    private lateinit var txtView: TextView
    private lateinit var switchMK: Switch
    private lateinit var btnConvert: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        editTextNumber = findViewById(R.id.editTextNumber)
        txtView = findViewById(R.id.txtView)
        btnConvert = findViewById<Button>(R.id.btnConvert)
        switchMK = findViewById(R.id.swMK)

        btnConvert.setOnClickListener {
            val inputText = editTextNumber.text.toString()
            if (inputText.isNotEmpty()) {
                val inputValue = inputText.toDouble()
                val result = if (switchMK.isChecked) {
                    milestokm(inputValue) // Miles to Kilometers
                } else {
                    kmtomile(inputValue) // Kilometers to Miles
                }
                txtView.text = "Result: $result ${if (switchMK.isChecked) "km" else "miles"}"
            }
        }

        // Handle Switch state change
        switchMK.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                switchMK.text = "Miles to Kilometers"
            } else {
                switchMK.text = "Kilometers to Miles"
            }
        }
    }

    private fun milestokm(miles: Double): Double {
        // Replace this with your miles to kilometers conversion logic
        return miles * 1.60934
    }

    private fun kmtomile(kilometers: Double): Double {
        // Replace this with your kilometers to miles conversion logic
        return kilometers / 1.60934
    }
    }
