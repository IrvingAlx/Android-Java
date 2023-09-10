package com.irving;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textBienvenido;
    Button miBoton;
    ImageView imagen;
    EditText editNombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textBienvenido = (TextView) findViewById(R.id.textBienvenido);
        miBoton = (Button) findViewById(R.id.miBoton);
        imagen = (ImageView) findViewById(R.id.imagen);
        editNombre = (EditText) findViewById(R.id.editNombre);

        miBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre;
                nombre = editNombre.getText().toString();

                if (!nombre.isEmpty()){
                    textBienvenido.setText("Miau " + nombre);
                    Toast.makeText(getApplicationContext(),"Presionaste el boton" + nombre, Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Debes darme tu nombre!!!" + nombre, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}