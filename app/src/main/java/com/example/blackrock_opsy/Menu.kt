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
    private lateinit var btnViewBird: ImageButton
    private lateinit var btnAddBird: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        //Add bird Page
        btnAddBird= findViewById(R.id.btnAddBird)
        btnAddBird.setOnClickListener {
            // Handle the button click event
            val intent = Intent(this, FindBirds::class.java)
            startActivity(intent)
        }

        //View bird Page
        btnViewBird= findViewById(R.id.btnViewBird)
        btnViewBird.setOnClickListener {
            // Handle the button click event
            val intent = Intent(this, ViewBird::class.java)
            startActivity(intent)
        }
        //Hotspot Page
        btnHotspot= findViewById(R.id.btnHotSpot)
        btnHotspot.setOnClickListener {
            // Handle the button click event
            val intent = Intent(this, BirdHotSpot::class.java)
            startActivity(intent)
        }
        //FindBird page
        btnFIndBird= findViewById(R.id.btnFindBird)
        btnFIndBird.setOnClickListener {
            // Handle the button click event
            val intent = Intent(this, FindBirds::class.java)
            startActivity(intent)
        }
        //takes you to settings page
        btnSettings= findViewById(R.id.btnSetting)
        btnSettings.setOnClickListener {
            // Handle the button click event
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
        }

       //Takes you to about page.
        btnAbout= findViewById(R.id.btnAboutUs)
        btnAbout.setOnClickListener {
            // Handle the button click event
            val intent = Intent(this, AboutUs::class.java)
            startActivity(intent)
        }
    }
}