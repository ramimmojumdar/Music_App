package com.example.musicapp;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    ImageView music, music1, music2, music3, music4, music5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        music = findViewById(R.id.music);
        music1 = findViewById(R.id.music1);
        music2 = findViewById(R.id.music2);
        music3 = findViewById(R.id.music3);
        music4 = findViewById(R.id.music4);
        music5 = findViewById(R.id.music5);


        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (music.getTag()!= null && music.getTag().toString().contains("NOT_PLAY")){

                    if(mediaPlayer!=null){
                        mediaPlayer.release();
                    }
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.song1);
                    mediaPlayer.start();
                    music.setImageResource(R.drawable.stop);
                    music.setTag("PLAY");

                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            music.setImageResource(R.drawable.start);
                            music.setTag("NOT_PLAY");
                        }
                    });

                }else {
                    if(mediaPlayer!=null) mediaPlayer.release();
                    music.setImageResource(R.drawable.start);
                    music.setTag("NOT_PLAY");
                }


            }
        });

        music1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (music1.getTag()!= null && music1.getTag().toString().contains("NOT_PLAY")){

                    if(mediaPlayer!=null){
                        mediaPlayer.release();
                    }
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.song1);
                    mediaPlayer.start();
                    music1.setImageResource(R.drawable.stop);
                    music1.setTag("PLAY");

                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            music1.setImageResource(R.drawable.start);
                            music1.setTag("NOT_PLAY");
                        }
                    });

                }else {
                    if(mediaPlayer!=null) mediaPlayer.release();
                    music1.setImageResource(R.drawable.start);
                    music1.setTag("NOT_PLAY");
                }


            }
        });

        music2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (music2.getTag()!= null && music2.getTag().toString().contains("NOT_PLAY")){

                    if(mediaPlayer!=null){
                        mediaPlayer.release();
                    }

                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.song1);
                    mediaPlayer.start();
                    music2.setImageResource(R.drawable.stop);
                    music2.setTag("PLAY");

                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            music2.setImageResource(R.drawable.start);
                            music2.setTag("NOT_PLAY");
                        }
                    });

                }else {
                    if(mediaPlayer!=null) mediaPlayer.release();
                    music2.setImageResource(R.drawable.start);
                    music2.setTag("NOT_PLAY");
                }


            }
        });

        music3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (music3.getTag()!= null && music3.getTag().toString().contains("NOT_PLAY")){

                    if(mediaPlayer!=null){
                        mediaPlayer.release();
                    }
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.song1);
                    mediaPlayer.start();
                    music3.setImageResource(R.drawable.stop);
                    music3.setTag("PLAY");

                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            music3.setImageResource(R.drawable.start);
                            music3.setTag("NOT_PLAY");
                        }
                    });

                }else {
                    if(mediaPlayer!=null) mediaPlayer.release();
                    music3.setImageResource(R.drawable.start);
                    music3.setTag("NOT_PLAY");
                }


            }
        });

        music4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (music4.getTag()!= null && music4.getTag().toString().contains("NOT_PLAY")){

                    if(mediaPlayer!=null){
                        mediaPlayer.release();
                    }
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.song1);
                    mediaPlayer.start();
                    music4.setImageResource(R.drawable.stop);
                    music4.setTag("PLAY");

                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            music4.setImageResource(R.drawable.start);
                            music4.setTag("NOT_PLAY");
                        }
                    });

                }else {
                    if(mediaPlayer!=null) mediaPlayer.release();
                    music4.setImageResource(R.drawable.start);
                    music4.setTag("NOT_PLAY");
                }


            }
        });

        music5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (music5.getTag()!= null && music5.getTag().toString().contains("NOT_PLAY")){

                    if(mediaPlayer!=null){
                        mediaPlayer.release();
                    }
                    mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.song1);
                    mediaPlayer.start();
                    music5.setImageResource(R.drawable.stop);
                    music5.setTag("PLAY");

                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            music5.setImageResource(R.drawable.start);
                            music5.setTag("NOT_PLAY");
                        }
                    });

                }else {
                    if(mediaPlayer!=null) mediaPlayer.release();
                    music5.setImageResource(R.drawable.start);
                    music5.setTag("NOT_PLAY");
                }


            }
        });





    }
}