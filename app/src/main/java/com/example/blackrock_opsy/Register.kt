package com.example.blackrock_opsy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth

class Register : AppCompatActivity() {

    //variables
    private lateinit var btnRegisters: Button
    private lateinit var auth: FirebaseAuth

    private lateinit var edtPasswordTwo: EditText
    private lateinit var edtUserrName: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        FirebaseApp.initializeApp(this)

        //Takes you to the next page.
        btnRegisters= findViewById(R.id.btnRegisters)
        btnRegisters.setOnClickListener {
            // Handle the button click event
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)

            auth = FirebaseAuth.getInstance()
            edtUserrName = findViewById(R.id.edtUserrName)
            edtPasswordTwo = findViewById(R.id.edtPasswordTwo)
             btnRegisters.setOnClickListener {

                 val Email = edtUserrName.text.toString().trim()
                 val Password = edtPasswordTwo.text.toString().trim()


            if (Email.isNotEmpty() && Password.isNotEmpty()) {
                auth.createUserWithEmailAndPassword(Email, Password)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            // Sign up success
                            Toast.makeText(this, "User created successfully", Toast.LENGTH_SHORT).show()
                        } else {
                            // If sign up fails, display a message to the user.
                            Toast.makeText(this, "Authentication failed.", Toast.LENGTH_SHORT).show()
                        }
                    }
            } else {
                Toast.makeText(this, "Please enter email and password", Toast.LENGTH_SHORT).show()
            }
        }



        }
    }
}