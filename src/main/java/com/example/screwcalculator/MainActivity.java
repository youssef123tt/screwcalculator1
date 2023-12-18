package com.example.screwcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

        private EditText player1;
    private EditText player2;
    private EditText player3;
    private EditText player4;


    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player1 = findViewById(R.id.player1);
        player2 = findViewById(R.id.player2);
        player3 = findViewById(R.id.player3);
        player4 = findViewById(R.id.player4);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                String firstplayer = player1.getText().toString();
                String secondplayer = player2.getText().toString();
                String thirdplayer = player3.getText().toString();
                String fourthplayer = player4.getText().toString();

                Log.d("MainActivity", "First Player: " + firstplayer);
                Log.d("MainActivity", "second Player: " + secondplayer);
                Log.d("MainActivity", "third Player: " + thirdplayer);
                Log.d("MainActivity", "Fourth Player: " + fourthplayer);
                Intent intent = new Intent(MainActivity.this, calculate.class);
                startActivity(intent);
            }

        });
    }



}