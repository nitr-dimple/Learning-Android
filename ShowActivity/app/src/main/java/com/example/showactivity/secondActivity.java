package com.example.showactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {
    private TextView showMessage;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        showMessage = (TextView) findViewById(R.id.messageTextViewId);
        backButton = (Button) findViewById(R.id.backButtonId);
        Bundle extras = getIntent().getExtras();

        if(extras!=null) {
            String message = extras.getString("Message");
            int myInt = extras.getInt("Value");
            showMessage.setText("Message is "+ message + "and Value is: " + String.valueOf(myInt));
        }

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnIntent = getIntent();
                returnIntent.putExtra("returnData", "From second Activity");
                setResult(RESULT_OK, returnIntent);
                finish();
            }
        });

    }


}
