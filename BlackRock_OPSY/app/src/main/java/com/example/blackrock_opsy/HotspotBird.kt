package com.example.blackrock_opsy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.CameraUpdateFactory

import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
//import com.example.googlemaps.databinding.ActivityMapsBinding

class HotspotBird : AppCompatActivity(), OnMapReadyCallback {

  /* private lateinit var mMap: GoogleMap
    private lateinit var binding: HotspotBirdBinding*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotspot_bird)

       /* binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.mapContainer) as SupportMapFragment
        mapFragment.getMapAsync(this)*/

    }
    override fun onMapReady(googleMap: GoogleMap) {
       /* mMap = googleMap

        // Add a marker in Sydney and move the camera
        val sydney = LatLng(-34.0, 151.0)
        mMap.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))

//-29.857606096558232, 31.011207990558702

        val capeTown = LatLng(-33.9249, 18.4241)
 mMap.addMarker(MarkerOptions().position(capeTown).title("Marker in Cape Town, South Africa"))
mMap.moveCamera(CameraUpdateFactory.newLatLng(capeTown))

 val Durban = LatLng(-29.857606096558232, 31.011207990558702)
 mMap.addMarker(MarkerOptions().position(Durban).title("Marker in Durban, South Africa"))
mMap.moveCamera(CameraUpdateFactory.newLatLng(Durban))*/

    }
}