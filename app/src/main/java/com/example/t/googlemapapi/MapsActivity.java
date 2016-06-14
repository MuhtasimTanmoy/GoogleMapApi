package com.example.t.googlemapapi;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.widget.Toast;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
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



        LatLng swh = new LatLng(23.726652, 90.389579);

        GoogleMapOptions options=new GoogleMapOptions();
        options.mapType(GoogleMap.MAP_TYPE_SATELLITE);


//        CameraPosition camPos = new CameraPosition.Builder()
//                .target(swh) // Sets the center of the map to uni.
//                .zoom(1) // Sets the zoom
//                .bearing(90) // Sets the orientation of the camera to east
//                .tilt(30) // Sets the tilt of the camera to 30 degrees
//                .build();
//
//        // Creates a CameraPosition from the builder
//        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(camPos));



//        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
//            // TODO: Consider calling
//            //    ActivityCompat#requestPermissions
//            // here to request the missing permissions, and then overriding
//            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
//            //                                          int[] grantResults)
//            // to handle the case where the user grants the permission. See the documentation
//            // for ActivityCompat#requestPermissions for more details.
//            return;
//        }
//        mMap.setMyLocationEnabled(true);

        mMap.addMarker(new MarkerOptions().position(swh).title("Suhrawardy Hall"));
       // mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);

        mMap.setPadding(0,0,0,500);
////

        mMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
            @Override
            public void onMapClick(LatLng latLng) {
                Log.d("onMapClick", "Latitude:"+latLng.latitude+", longitude:" + latLng.longitude);
                mMap.addMarker(new MarkerOptions().position(latLng).title("New Place"));
                Toast t;
                t=Toast.makeText(MapsActivity.this,latLng.toString(),Toast.LENGTH_LONG);
                t.setGravity(Gravity.TOP|Gravity.LEFT,10,3);
                t.show();
            }
        });


        //mMap.moveCamera(CameraUpdateFactory.newLatLng(swh));

    }
}
<<<<<<< HEAD
//////
//////
=======
///
//////////////sdasdsdasdasdasd
>>>>>>> mine
