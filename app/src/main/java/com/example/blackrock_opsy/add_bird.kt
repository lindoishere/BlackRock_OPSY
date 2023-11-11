package com.example.blackrock_opsy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.firebase.database.FirebaseDatabase

class add_bird : AppCompatActivity() {
    private lateinit var  btnAdd: Button
    private lateinit var edtBirdName: EditText
    private lateinit var edtBirdColour: EditText
    private lateinit var edtBirdDiet: EditText
    private lateinit var edtLocation: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_bird)
        //Database instance
      val database = FirebaseDatabase.getInstance()
        val myRef = database.getReference("Birds")

        btnAdd= findViewById(R.id.btnAdd)

         edtBirdName=findViewById(R.id.edtBirdName)
        edtBirdColour=findViewById(R.id.edtBirdColour)
        edtBirdDiet=findViewById(R.id.edtBirdDiet)
        edtLocation=findViewById(R.id.edtBirdLocation)


        val birdData = BirdData(
            edtBirdName.text.toString(),
            edtBirdColour.text.toString(),
            edtBirdDiet.text.toString(),
            edtLocation.text.toString()
        )
        btnAdd.setOnClickListener(){
           //Add if statement to check if fields are empty

            //Push Data to a firebase database
           myRef.push().setValue(birdData)
        }
     //Write a message to the database.
     /*   FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        myRef.setValue("Hello, World!");*/
    }
}