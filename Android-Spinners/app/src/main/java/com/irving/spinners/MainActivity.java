package com.irving.spinners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner familySpiner = (Spinner) findViewById(R.id.spinnerFamily);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.family, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        familySpiner.setAdapter(adapter);
    }
}