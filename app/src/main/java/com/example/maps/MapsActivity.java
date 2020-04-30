package com.example.maps;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng smam = new LatLng(-6.989692, 112.558457);
        mMap.addMarker(new MarkerOptions().position(smam).title("SMA Muhammadiyah 4 Sidayu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(smam));

        LatLng mam = new LatLng(-6.989576, 112.560329);
        mMap.addMarker(new MarkerOptions().position(mam).title("MA Muhammadiyah 1 Sidayu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mam));

        LatLng smansi = new LatLng(-6.999195, 112.564074);
        mMap.addMarker(new MarkerOptions().position(smansi).title("SMA Negeri 1 Sidayu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(smansi));

        LatLng smak = new LatLng(-6.962539, 112.511206);
        mMap.addMarker(new MarkerOptions().position(smak).title("SMK Negeri 1 Sidayu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(smak));

        LatLng ksepuh = new LatLng(-6.989060, 112.559481);
        mMap.addMarker(new MarkerOptions().position(ksepuh).title("SMA-MA Kanjeng Sepuh Sidayu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ksepuh));
    }
}
