package com.irving.listenersinterface;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnInterOne = (Button) findViewById(R.id.btnInterOne);
        Button btnInterTwo = (Button) findViewById(R.id.btnInterTwo);

        btnInterOne.setOnClickListener(this);
        btnInterTwo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.btnInterOne) {
            Toast.makeText(getApplicationContext(), "This is button one", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.btnInterTwo) {
            Toast.makeText(getApplicationContext(), "This is button two", Toast.LENGTH_SHORT).show();
        }
    }
}