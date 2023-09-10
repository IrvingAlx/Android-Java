package com.irving.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView wv = (WebView) findViewById(R.id.webViewUser);

        //wv.loadUrl("https://www.google.com");

        String information = "<html><body><h1>Welcome Andorid</h1><p>No sabia que esto se podia</p></body><html>";
        wv.loadData(information,"text/html",null);
    }
}