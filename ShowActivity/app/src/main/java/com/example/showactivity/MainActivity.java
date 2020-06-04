package com.example.showactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button goToSecondButton;
    private final int REQUEST_CODE = 2;



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

//                startActivity(intent);
                startActivityForResult(intent, REQUEST_CODE);

//                startActivity(new Intent(MainActivity.this, secondActivity.class));

            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_CODE)
        {
            if(resultCode == RESULT_OK)
            {
                String results = data.getStringExtra("returnData");
                Toast.makeText(MainActivity.this, results , Toast.LENGTH_LONG).show();
            }
        }


    }
}
