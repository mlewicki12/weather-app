package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText tempC;
    Button convertButton;
    TextView tempF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tempC = (EditText) findViewById(R.id.tempC);
        convertButton = (Button) findViewById(R.id.convertButton);
        tempF = (TextView) findViewById(R.id.tempF);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = tempC.getText().toString();
                int temp = Integer.parseInt(input);
                float fahr = (temp * 9/5) + 32;
                tempF.setText(fahr + " degrees F");
            }
        });
    }
}