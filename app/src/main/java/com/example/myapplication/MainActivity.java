package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText massIn;
    private Button button;
    private TextView fuelOut;
    private String mass ="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        massIn = findViewById(R.id.massIn);
        button = findViewById(R.id.button);
        fuelOut = findViewById(R.id.fuelOut);
        button.setOnClickListener(listener);
    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mass = massIn.getText().toString();
            fuelOut.setText("Вам потребуется " + Algorithm.fuelCalculation(mass)+ " килограмм топлива ");
        }
    };
}