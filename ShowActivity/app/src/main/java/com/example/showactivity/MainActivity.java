package com.example.showactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button goToSecondButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goToSecondButton = (Button) findViewById(R.id.showButtonId);

        goToSecondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, secondActivity.class);
                intent.putExtra("Message", "Hello from first Activity");
                intent.putExtra("SecondMessage", "Hello Again");
                intent.putExtra("Value", 123);

                startActivity(intent);

//                startActivity(new Intent(MainActivity.this, secondActivity.class));

            }
        });
    }
}
