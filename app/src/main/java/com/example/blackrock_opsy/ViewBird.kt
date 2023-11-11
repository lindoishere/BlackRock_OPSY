package com.example.blackrock_opsy

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener


class ViewBird : AppCompatActivity() {
    private lateinit var tvDisplay: TextView

    private lateinit var  btnView: Button
    var databaseReference = FirebaseDatabase.getInstance().getReference("Birds")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_bird)
        btnView= findViewById(R.id.btnView)
        tvDisplay= findViewById(R.id.tvDisplay)
//Supposed to read data from a database.
        databaseReference.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // Data snapshot contains the retrieved data
                for (snapshot in dataSnapshot.children) {
                    val birdData = snapshot.getValue(BirdData::class.java)
                    // Now, you can use birdData to display or manipulate the data in your app.
                    tvDisplay.text = "Bird Name: " + birdData?.name + "\n" +
                            "Bird Color: " + birdData?.color + "\n" +
                            "Bird Diet: " + birdData?.diet + "\n" +
                            "Location: " + birdData?.location

                }
            }

            override fun onCancelled(databaseError: DatabaseError) {
                // Handle any errors here
            }
        })

//btnView.setOnClickListener(new)
    }

}