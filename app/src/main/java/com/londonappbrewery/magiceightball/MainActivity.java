package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_Ask= (Button) findViewById(R.id.Button_Ask);
        final ImageView Image_Change = (ImageView) findViewById(R.id.Image_EightBall);
        final int[] Array_Image = {R.drawable.ball1,
        R.drawable.ball2,
        R.drawable.ball3,
        R.drawable.ball3,
        R.drawable.ball4,
        R.drawable.ball5};

        button_Ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Button: ", "The button is clicked");

                Random Random_Number_Genarator = new Random();
                int number = Random_Number_Genarator.nextInt(6);
                Image_Change.setImageResource(Array_Image[number]);
            }
        });
    }
}
