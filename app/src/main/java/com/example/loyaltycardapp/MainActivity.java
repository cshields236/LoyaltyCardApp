package com.example.loyaltycardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate (View view){
        EditText bill = findViewById(R.id.billTxt);
        EditText tipPercent = findViewById(R.id.tipPercentTxt);

        String s1 = bill.getText().toString();
        String s2 = tipPercent.getText().toString();
        int tip = Integer.parseInt(s1) * Integer.parseInt(s2) / 100;
        float total = Float.parseFloat(s1) + Float.parseFloat(String.valueOf(tip));



        TextView r = findViewById(R.id.totalBillView);


        r.setText(String.valueOf(total));

    }
}
