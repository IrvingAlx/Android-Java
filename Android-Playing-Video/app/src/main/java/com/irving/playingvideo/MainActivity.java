package com.irving.playingvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView vv = (VideoView) findViewById(R.id.vv);
        String path = "android.resource://"+getPackageName()+"/"+R.raw.video;
        Uri uri = Uri.parse(path);
        vv.setVideoURI(uri);

        // Uri path = Uri.parse("android:resources://com.irving.playingvideo/"+R.raw.video);
        // vv.setVideoURI(path);
        vv.setMediaController(new MediaController(this));

        vv.requestFocus();
        vv.start();
    }
}