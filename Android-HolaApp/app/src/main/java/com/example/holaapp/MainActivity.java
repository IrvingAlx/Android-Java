package com.example.holaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button miBoton;
    TextView textoSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miBoton = (Button)findViewById(R.id.botoncito);
        textoSaludo = (TextView)findViewById(R.id.textoSaludo);
        textoSaludo.setText("Hola nuevo");
        miBoton.setText("presioname");
        miBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textoSaludo.setText("Me apachurarron");
            }
        });
    }
}