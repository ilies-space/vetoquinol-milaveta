package com.vetoquinol.algerie.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.vetoquinol.algerie.R;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

public class splash_screen_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.z_activity_splash_screen);

        //initiation GifImageView:
        final GifImageView gifImageView ;
        gifImageView = findViewById(R.id.splachgif);

        //stop the gif after 3.5sec :
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                ((GifDrawable)gifImageView.getDrawable()).stop();

            }
        }, 3500);
        // Gif will turn into fixed frame

        //the end off SplashScreen after 4.3sec
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //moving to next page -> MainActivity
                Intent mySuperIntent = new Intent(splash_screen_activity.this, MainActivity.class);
                startActivity(mySuperIntent);
                //stop Splash ScreenActivity :
                finish();

            }
        }, 4300);

    }


    @Override
    public void onBackPressed() {

    }
}
