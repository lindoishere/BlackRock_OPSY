package com.example.blackrock_opsy

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import android.view.View



class MainActivity : AppCompatActivity() {
    private lateinit var btnRegister: Button
    private lateinit var btnLogIn: Button
    private var mAuth: FirebaseAuth? = null

   /* override fun onStart() {
        super.onStart()
        FirebaseUser currentUser = mAuth.getCurrentUser()
        updateUI(currentUser);
    }*/

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
        mAuth = FirebaseAuth.getInstance();
        //Takes you to the next page.
        btnLogIn = findViewById(R.id.btnLogIn)
        btnLogIn.setOnClickListener {
            // Handle the button click event
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)

            //Takes users info to  firebase hopefully


        }



    }

    //on-click event for the registration link
    fun onRegisterLinkClick(view: View) {
        // Implement the logic to navigate to the new page when the link is clicked
        // For example:

        val intent = Intent(this, Register:: class.java)
        startActivity(intent)
    }
}