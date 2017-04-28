package com.example.edwin.sistema_hotel;

import android.support.v4.app.FragmentActivity;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import android.widget.Spinner;
import android.widget.Toast;
import android.os.Bundle;
import android.view.View;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    Spinner spinner_distrito;
    String[] items;
    private boolean isFirstTime = true;


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.getUiSettings().setZoomControlsEnabled(true);
        // Add a marker in Sydney and move the camera
        LatLng chorrillos = new LatLng(-12.183371159968187, -77.00988790953977);
        LatLng barranco = new LatLng(-12.1437266, -77.01902280000002);

        mMap.addMarker(new MarkerOptions().position(chorrillos).title("Hotel Perla"));
        mMap.addMarker(new MarkerOptions().position(barranco).title("Hotel Perla"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(chorrillos,16));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(barranco,16));

        MarkerOptions parqueI = new MarkerOptions().title("Hotel").position(chorrillos);
        MarkerOptions parque2 = new MarkerOptions().title("Hotel").position(barranco);
        mMap.addMarker(parqueI);
        mMap.addMarker(parque2);
        mMap.setMyLocationEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps2);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        //////////////////////////AGREGADO PARA PRUEBA
        spinner_distrito = (Spinner) findViewById(R.id.spinner_distrito);
        items = getResources().getStringArray(R.array.Mapa_Distritos);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(getBaseContext(),android.R.layout.simple_spinner_item,items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_distrito.setAdapter(adapter);
        spinner_distrito.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent,View view, int position, long id){
               if(isFirstTime){
                isFirstTime = false;
                 }else
                        {
                       Toast.makeText(getApplicationContext(),items[position], Toast.LENGTH_LONG).show();

                                                           }
                                                       }
                                                       @Override
                                                       public void onNothingSelected(AdapterView<?> parent){
                                                       }
                                                   }

        );


    }


}
