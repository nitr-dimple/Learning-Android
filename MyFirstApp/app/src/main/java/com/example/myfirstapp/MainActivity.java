package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mButton;
    private TextView mTextView;
    private EditText mEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button) findViewById(R.id.mButton);
        mTextView = (TextView) findViewById((R.id.mTextView));
        mEditText = (EditText) findViewById(R.id.editText);

        mButton.setText(R.string.button_name);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredText;
                enteredText = mEditText.getText().toString();
                mTextView.setVisibility(View.VISIBLE);
                mTextView.setText(enteredText);
            }
        });
    }

//    public void ShowMe(View view)
//    {
//        mTextView.setVisibility(View.VISIBLE);
//        mTextView.setText(R.string.show_text);
//    }
}
