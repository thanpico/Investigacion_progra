package com.example.mapa11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button sitios = findViewById(R.id.sitios);
        final Button tipos = findViewById(R.id.tipos);
        final Button ubicacion = findViewById(R.id.ubicacion);

        sitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //metodo para mandar a llamar al mapa, variable de tio Intent
                Intent intent = new Intent(getApplicationContext(),MapsActivity1.class);
                startActivity(intent);
            }
        });
        tipos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MapsActivityTipos.class);
                startActivity(intent);
            }
        });

        ubicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MapsActivitylocalizacion.class);
                startActivity(intent);
            }
        });
    }
}
