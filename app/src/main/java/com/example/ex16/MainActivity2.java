package com.example.ex16;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView blueScoreTextView = findViewById(R.id.bstv);
        TextView redScoreTextView = findViewById(R.id.rstv);
        TextView winnerTextView = findViewById(R.id.wtv);

        Intent gi = getIntent();
        int blueScore = gi.getIntExtra("blueScore", 0);
        int redScore = gi.getIntExtra("redScore", 0);

        blueScoreTextView.setText("Blue: " + blueScore);
        redScoreTextView.setText("Red: " + redScore);

        if (blueScore > redScore) {
            winnerTextView.setText("Winner: Blue");
        } else if (redScore > blueScore) {
            winnerTextView.setText("Winner: Red");
        } else {
            winnerTextView.setText("It's a tie!");
        }
    }

    public void clickedBack(View view) {
        finish();
    }
}
