package com.example.showactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {
    private TextView showMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        showMessage = (TextView) findViewById(R.id.messageTextViewId);
        Bundle extras = getIntent().getExtras();

        if(extras!=null) {
            String message = extras.getString("Message");
            int myInt = extras.getInt("Value");
            showMessage.setText("Message is "+ message + "and Value is: " + String.valueOf(myInt));
        }

    }
}
