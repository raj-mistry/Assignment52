package com.example.assignment5;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {
    MediaPlayer myMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        myMusic = MediaPlayer.create(this,R.raw.song);
        myMusic.start();
        TimerTask task = new TimerTask(){
            @Override
            public void run(){
                myMusic.pause();
                finish();
                startActivity(new Intent(SplashScreen.this,ItemListActivity.class));
            }
        };
        Timer opening = new Timer();
        opening.schedule(task,5000);

    }
}