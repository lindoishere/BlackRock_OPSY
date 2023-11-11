package com.example.blackrock_opsy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnRegister: Button
    private lateinit var btnLogIn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       //Takes you to the register page.
        btnRegister = findViewById(R.id.btnRegister)
        btnRegister.setOnClickListener {
            // Handle the button click event
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }

        //Takes you to the next page.
        btnLogIn = findViewById(R.id.btnLogIn)
        btnLogIn.setOnClickListener {
            // Handle the button click event
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }



    }
}