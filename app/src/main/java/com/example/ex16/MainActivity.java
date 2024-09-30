package com.example.ex16;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnRed, btnBlue;
    int blueScore = 0, redScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRed = (Button) findViewById(R.id.btnRed);
        btnBlue = (Button) findViewById(R.id.btnBlue);

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blueScore++;
            }
        });

        btnRed.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                redScore += 2;
                return true;
            }
        });
    }

    public void clickedResult(View view) {
        Intent si = new Intent(this, MainActivity2.class);
        si.putExtra("blueScore", blueScore);
        si.putExtra("redScore", redScore);
        startActivity(si);

        blueScore = 0;
        redScore = 0;
    }
}
