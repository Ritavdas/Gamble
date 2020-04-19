package com.example.gamble;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = (Button) findViewById(R.id.rollButton);
        final ImageView Left_Dice =(ImageView) findViewById(R.id.Left_Dice);
        final ImageView Right_Dice =(ImageView) findViewById(R.id.Right_Dice);
        final int [] diceArray ={
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6, };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Gamble","Yeah Going good bro!");
                Random randomNumberGenerator  = new Random();
                int number = randomNumberGenerator.nextInt(6) ;
                Left_Dice.setImageResource(diceArray[number]);
                Log.d("Gamble","The number on the left dice is: " + number);
                number = randomNumberGenerator.nextInt(6);
                Right_Dice.setImageResource(diceArray[number]);
                Log.d("Gamble","The number on the Right dice is: " + number);

            }
        });

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}
