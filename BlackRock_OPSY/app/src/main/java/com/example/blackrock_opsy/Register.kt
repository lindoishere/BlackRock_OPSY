package com.example.blackrock_opsy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Register : AppCompatActivity() {
    private lateinit var btnRegisters: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        //Takes you to the next page.
        btnRegisters= findViewById(R.id.btnRegisters)
        btnRegisters.setOnClickListener {
            // Handle the button click event
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }
    }
}