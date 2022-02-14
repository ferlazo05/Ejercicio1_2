package com.example.ejercicio1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityInfo extends AppCompatActivity {

    TextView TvNombres, TvApellidos, TvEdad, TvCorreo;
    String info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        TvNombres = (TextView) findViewById(R.id.InfoTvNom);
        TvApellidos = (TextView) findViewById(R.id.InfoTvApe);
        TvEdad = (TextView) findViewById(R.id.InfoTvEdad);
        TvCorreo = (TextView) findViewById(R.id.InfoTvCorreo);

        Bundle recibe_datos = getIntent().getExtras();
        info = recibe_datos.getString("nombres");
        TvNombres.setText(info);
        info = recibe_datos.getString("apellidos");
        TvApellidos.setText(info);
        info = recibe_datos.getString("edad");
        TvEdad.setText(info);
        info = recibe_datos.getString("correo");
        TvCorreo.setText(info);

    }
}