package com.edwardtorpy.bubbleanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public void bubble(View view) {

        Random rand = new Random();
        int xDisplacement = rand.nextInt(100);
        xDisplacement -= 50;
        
        ImageView bubble = (ImageView) findViewById(R.id.bubbleimageView);
        bubble.setTranslationY(400);
        bubble.setTranslationX(xDisplacement * 5);
        bubble.setAlpha(1f);
        bubble.animate().translationYBy(-450).setDuration(1000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
