package com.example.ejercicio1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nombres, apellidos, edad, correo;
    Button btn_enviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombres = (EditText) findViewById(R.id.txtNombres);
        apellidos = (EditText) findViewById(R.id.txtApellidos);
        edad = (EditText) findViewById(R.id.txtEdad);
        correo = (EditText) findViewById(R.id.txtCorreo);
        btn_enviar = (Button) findViewById(R.id.btnEnviar);

        btn_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviarDatos();
            }
        });
    }

    public void enviarDatos()
    {
        Bundle enviar_datos = new Bundle();
        enviar_datos.putString("nombres", nombres.getText().toString());
        enviar_datos.putString("apellidos", apellidos.getText().toString());
        enviar_datos.putString("edad", edad.getText().toString());
        enviar_datos.putString("correo", correo.getText().toString());

        Intent intent = new Intent(getApplicationContext(), ActivityInfo.class);
        intent.putExtras(enviar_datos);
        startActivity(intent);
    }
}