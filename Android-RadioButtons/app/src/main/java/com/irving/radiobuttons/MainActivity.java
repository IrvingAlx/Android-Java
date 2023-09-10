package com.irving.radiobuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioButton red = (RadioButton) findViewById(R.id.radioButtonRed);
        final RadioButton green = (RadioButton) findViewById(R.id.radioButtonGreen);
        final RadioButton blue = (RadioButton) findViewById(R.id.radioButtonBlue);
        final Button which = (Button) findViewById(R.id.buttonWhich);

        which.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(red.isChecked()){
                    Toast.makeText(getApplicationContext(), "red", Toast.LENGTH_SHORT).show();
                } else if (green.isChecked()) {
                    Toast.makeText(getApplicationContext(),"green",Toast.LENGTH_SHORT).show();
                } else if (blue.isChecked()) {
                    Toast.makeText(getApplicationContext(), "blue", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}