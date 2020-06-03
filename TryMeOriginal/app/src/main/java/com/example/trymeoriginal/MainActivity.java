package com.example.trymeoriginal;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View windowView;
    private Button tryMeButton;
    private int colors[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        windowView = findViewById((R.id.windowViewId));
        tryMeButton = (Button)  findViewById((R.id.tryMeButton));
        colors = new int[]{Color.CYAN, Color.GREEN, Color.RED, Color.BLACK,Color.BLUE, Color.DKGRAY, Color.LTGRAY, Color.MAGENTA, Color.YELLOW};


        tryMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int randomNum = random.nextInt(colors.length);
                windowView.setBackgroundColor(colors[randomNum]);
            }
        });
    }
}
