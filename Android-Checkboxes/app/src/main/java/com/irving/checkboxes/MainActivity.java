package com.irving.checkboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CheckBox cbApp = (CheckBox) findViewById(R.id.checkBoxAppetizer);
        final CheckBox cbEnt = (CheckBox) findViewById(R.id.checkBoxEntree);
        final CheckBox cbDess = (CheckBox) findViewById(R.id.checkBoxDessert);
        final Button btnOrder = (Button) findViewById(R.id.buttonPlaceOrder);

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder order = new StringBuilder();
                if(cbApp.isChecked()){
                    order.append("Appetizer");
                }
                if(cbEnt.isChecked()){
                    order.append("Entree");
                }
                if(cbDess.isChecked()){
                    order.append("Dessert");
                }
                Toast.makeText(getApplicationContext(),order,Toast.LENGTH_SHORT).show();
            }
        });
    }
}