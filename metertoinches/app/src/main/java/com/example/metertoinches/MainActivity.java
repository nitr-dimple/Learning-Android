package com.example.metertoinches;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*
    1m = 39.3701in
     */
    private EditText enterMeters;
    private Button convert;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterMeters = (EditText) findViewById(R.id.metersId);
        convert = (Button) findViewById(R.id.convertId);
        result = (TextView) findViewById(R.id.resultid);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double multipler = 39.37;
                double r = 0.0;

                if(enterMeters.getText().toString().equals(""))
                {
                    result.setText(R.string.error_message);
                    result.setTextColor(Color.RED);
                }
                else
                {
                    double meterValue = Double.parseDouble(enterMeters.getText().toString());
                    r = multipler * meterValue;
                    result.setTextColor(Color.DKGRAY);
                    result.setText(String.format("%.2f",r) + " inches");
                }
            }
        });
    }
}
