package com.example.loyaltycardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoyaltyView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loyalty_view);
        Intent intent = getIntent();
        String carNo = intent.getStringExtra(MainActivity.KEY1);
        TextView ct = findViewById(R.id.cardNoView);
        ct.setText(carNo);

        String tb = intent.getStringExtra("KEY2");
        TextView b = findViewById(R.id.billView);
        b.setText(tb);

        int difference =  Integer.parseInt(tb)- 100;

        int points = difference / 10;

        TextView p = findViewById(R.id.pointsView);

        p.setText(String.valueOf(points));
    }
}
