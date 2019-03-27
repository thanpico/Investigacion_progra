package com.example.mapa11;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity1 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps1);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }




    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        //pasa como para metros la latitud y la logitud
        LatLng sydney = new LatLng(-34, 151);
        // metodo addmarket, la pasamos la pasicion y titulo de la marca, otro parametro
        // es snipper que es un string
        //icon para poner un icono
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        LatLng Unadeca = new LatLng(10.031557 ,-84.216883);
        mMap.addMarker(new MarkerOptions().position(Unadeca).title("UNADECA").snippet("Universidad Adventista de Centroamérica"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Unadeca,12));

        LatLng Quiosco = new LatLng(10.016429  ,-84.213793);
        mMap.addMarker(new MarkerOptions().position(Quiosco).title("Paque Central Alajuela").snippet("Quiosco, Calle 2, Provincia Alajuela, Alajuela, El Carmen, 20101 Costa Rica"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Quiosco,12));

        LatLng CalleLoría = new LatLng(10.043365  ,-84.217205);
        mMap.addMarker(new MarkerOptions().position(CalleLoría).title("Casa James").snippet("Casa de James Ozuna"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(CalleLoría,12));

        LatLng PuebloNuevo = new LatLng(10.021166   ,-84.225722);
        mMap.addMarker(new MarkerOptions().position(PuebloNuevo).title("Casa Than").snippet("Casa de Than"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(PuebloNuevo,12));



    }
}
