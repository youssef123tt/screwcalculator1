package com.example.screwcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class calculate extends AppCompatActivity {
    private EditText player1current;
    private EditText player2current;
    private EditText player3current;
    private EditText player4current;
    private EditText player5current;
    private EditText player6current;

    float sum1 = 0;
    float sum2 = 0;
    float sum3 = 0;
    float sum4 = 0;
    float sum5 = 0;
    float sum6 = 0;
    private Button button2;
    private Button button3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        player1current = findViewById(R.id.player1current);
        player2current = findViewById(R.id.player2current);
        player3current = findViewById(R.id.player3current);
        player4current = findViewById(R.id.player4current);
        player5current = findViewById(R.id.player5current);
        player6current = findViewById(R.id.player6current);

        button2  = findViewById(R.id.button2);
        button3  = findViewById(R.id.button3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Call finish() to close the current activity and go back to the previous one
                finish();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Check if any of the EditText fields are empty
                if (player1current.getText().toString().isEmpty() ||
                        player2current.getText().toString().isEmpty() ||
                        player3current.getText().toString().isEmpty() ||
                        player4current.getText().toString().isEmpty() ||
                        player5current.getText().toString().isEmpty() ||
                        player6current.getText().toString().isEmpty()) {

                    // Display a message or handle the case where one or more fields are empty
                    // For now, I'm displaying a Toast message
                    Toast.makeText(calculate.this, "Please enter values in all fields", Toast.LENGTH_SHORT).show();
                    return; // Exit the method to prevent further execution
                }


                float firstPlayer = Float.parseFloat(player1current.getText().toString());
                float secondPlayer = Float.parseFloat(player2current.getText().toString());
                float thirdPlayer = Float.parseFloat(player3current.getText().toString());
                float fourthPlayer = Float.parseFloat(player4current.getText().toString());
                float fifthPlayer = Float.parseFloat(player5current.getText().toString());
                float sixthPlayer = Float.parseFloat(player6current.getText().toString());

                TextView textViewResult1 = findViewById(R.id.result1);
                TextView textViewResult2 = findViewById(R.id.result2);
                TextView textViewResult3 = findViewById(R.id.result3);
                TextView textViewResult4 = findViewById(R.id.result4);
                TextView textViewResult5 = findViewById(R.id.result5);
                TextView textViewResult6 = findViewById(R.id.result6);


               textViewResult1.setText(String.valueOf(firstPlayer)) ;
                textViewResult2.setText(String.valueOf(secondPlayer));
                textViewResult3.setText(String.valueOf(thirdPlayer));
                textViewResult4.setText(String.valueOf(fourthPlayer));
                textViewResult5.setText(String.valueOf(fifthPlayer));
                textViewResult6.setText(String.valueOf(sixthPlayer));

                sum1 += firstPlayer;
                sum2 += secondPlayer;
                sum3 += thirdPlayer;
                sum4 += fourthPlayer;
                sum5 += fifthPlayer;
                sum6 += sixthPlayer;

                textViewResult1.setText(String.valueOf(sum1));
                textViewResult2.setText(String.valueOf(sum2));
                textViewResult3.setText(String.valueOf(sum3));
                textViewResult4.setText(String.valueOf(sum4));
                textViewResult5.setText(String.valueOf(sum5));
                textViewResult6.setText(String.valueOf(sum6));
            }
        });
    }
}