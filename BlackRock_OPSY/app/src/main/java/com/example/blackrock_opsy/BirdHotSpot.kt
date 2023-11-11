package com.example.blackrock_opsy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.blackrock_opsy.databinding.ActivityBirdHotSpotBinding

class BirdHotSpot : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityBirdHotSpotBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBirdHotSpotBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera


        val capeTown = LatLng(-33.9249, 18.4241)
        mMap.addMarker(MarkerOptions().position(capeTown).title("Marker in Cape Town, South Africa"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(capeTown))

        val Durban = LatLng(-29.857606096558232, 31.011207990558702)
        mMap.addMarker(MarkerOptions().position(Durban).title("Marker in Durban, South Africa"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Durban))
    }
}