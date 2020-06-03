package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox momcheckBox;
    private CheckBox dadcheckBox;
    private CheckBox sistercheckBox;
    private Button showButton;
    private TextView showTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        momcheckBox = (CheckBox) findViewById(R.id.momId);
        dadcheckBox = (CheckBox) findViewById(R.id.dadId);
        sistercheckBox = (CheckBox) findViewById(R.id.sisterId);
        showButton = (Button) findViewById(R.id.showButtonId);
        showTextView = (TextView) findViewById(R.id.resultId);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(momcheckBox.getText().toString() + " status is: " + momcheckBox.isChecked() + "\n");
                stringBuilder.append(dadcheckBox.getText().toString() + " status is: " + dadcheckBox.isChecked() + "\n");
                stringBuilder.append(sistercheckBox.getText().toString() + " status is: " + sistercheckBox.isChecked() + "\n");
                showTextView.setText(stringBuilder);
            }
        });
    }
}
