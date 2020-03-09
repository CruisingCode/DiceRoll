package com.example.diceroll;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Random myRandom = new Random();


        Button buttonGenerate = (Button) findViewById(R.id.Dice);
        final TextView Roll1 = (TextView) findViewById(R.id.Die1);
        final TextView Roll2 = (TextView) findViewById(R.id.Die2);
        final TextView Sum = (TextView) findViewById(R.id.Sum);

        buttonGenerate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Roll1.setText(String.valueOf(myRandom.nextInt(6)+1));
                Roll2.setText(String.valueOf(myRandom.nextInt(6)+1));
                int Num1 = 0;
                int Num2 = 0;
                Num1 = Integer.parseInt(Roll1.getText().toString());
                Num2 = Integer.parseInt(Roll2.getText().toString());

                Sum.setText(String.valueOf(Num1 + Num2));
            }
        });
    }
}