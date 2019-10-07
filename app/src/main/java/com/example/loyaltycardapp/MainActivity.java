package com.example.loyaltycardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String KEY1="cardNo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate (View view){
        EditText bill = findViewById(R.id.billTxt);
        EditText tipPercent = findViewById(R.id.tipPercentTxt);

        EditText cardNum = findViewById(R.id.cardNoTxt);
        String s3 = cardNum.getText().toString();


        String s1 = bill.getText().toString();
        String s2 = tipPercent.getText().toString();

        int tip = Integer.parseInt(s1) * Integer.parseInt(s2) / 100;
        float total = Float.parseFloat(s1) + Float.parseFloat(String.valueOf(tip));



        String s4 = String.format("%.0f", total);



        TextView r = findViewById(R.id.totalBillView);




        if (total <= 100){
            r.setText(s4);
        }
        else{
            Intent intent= new Intent(MainActivity.this, LoyaltyView.class);
            intent.putExtra(KEY1, s3 );

            intent.putExtra("KEY2", s4);

            startActivity(intent);
        }

    }
}
