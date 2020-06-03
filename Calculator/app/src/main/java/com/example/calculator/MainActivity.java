package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText enteredAmount;
    private SeekBar seekBar;
    private Button calculateButton;
    private TextView totlaResult;
    private TextView textViewSeekBar;
    private int seekBarPercentage;
    private float enteredBill;
    private TextView totalBill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enteredAmount = (EditText) findViewById(R.id.billAmountId);
        seekBar = (SeekBar) findViewById(R.id.percentageSeekBarId);
        calculateButton = (Button) findViewById(R.id.calculateId);
        totlaResult = (TextView) findViewById(R.id.resultId);
        textViewSeekBar = (TextView) findViewById(R.id.textViewSeekBar);
        totalBill = (TextView) findViewById(R.id.totalBillid);

        calculateButton.setOnClickListener(this);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    textViewSeekBar.setText(String.valueOf(seekBar.getProgress()) + "%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                seekBarPercentage = seekBar.getProgress();

            }
        });


    }

    @Override
    public void onClick(View v) {
        calculate();

    }

    public void calculate()
    {
        float result = 0.0f;
        if(!enteredAmount.getText().toString().equals(""))
        {
            enteredBill =  Float.parseFloat(enteredAmount.getText().toString());
            result = enteredBill * seekBarPercentage / 100;
            totlaResult.setText("Your tip will be Rs." + String.valueOf(result));
            totalBill.setText("Your total bill is Rs." + String.valueOf(result + enteredBill));
        }
        else
        {
            Toast.makeText(MainActivity.this, "Please Enter a Bill Amount", Toast.LENGTH_LONG).show();
        }

    }
}
