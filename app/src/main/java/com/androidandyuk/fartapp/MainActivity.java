package com.androidandyuk.fartapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    public void playRandomSound(View view) {

        int[] farts = {R.raw.fart1, R.raw.fart2, R.raw.fart3, R.raw.fart4, R.raw.fart5, R.raw.fart6, R.raw.fart7, R.raw.fart8};
        Random rand = new Random();
        int rndm = rand.nextInt(7) + 1; // I have 8 random sounds to play sequentially named 'my sound' + n.
        Log.i("playRandomSound", "Playing fart " + rndm);
        mediaPlayer = MediaPlayer.create(this, farts[rndm]);
        mediaPlayer.start();
    }

    public void pauseSound(View view) {

        mediaPlayer.pause();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
