package com.example.blackrock_opsy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Menu : AppCompatActivity() {

    private lateinit var btnAbout: ImageButton
    private lateinit var btnSettings: ImageButton
    private lateinit var btnFIndBird: ImageButton
    private lateinit var btnHotspot: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        //Hotspot Page
        btnHotspot= findViewById(R.id.btnHotspot)
        btnHotspot.setOnClickListener {
            // Handle the button click event
            val intent = Intent(this, BirdHotSpot::class.java)
            startActivity(intent)
        }
        //FindBird page
        btnFIndBird= findViewById(R.id.btnFIndBird)
        btnFIndBird.setOnClickListener {
            // Handle the button click event
            val intent = Intent(this, FindBirds::class.java)
            startActivity(intent)
        }
        //takes you to settings page
        btnSettings= findViewById(R.id.btnSettings)
        btnSettings.setOnClickListener {
            // Handle the button click event
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
        }

       //Takes you to about page.
        btnAbout= findViewById(R.id.btnAbout)
        btnAbout.setOnClickListener {
            // Handle the button click event
            val intent = Intent(this, AboutUs::class.java)
            startActivity(intent)
        }
    }
}