package com.example.ex16;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Switch switch1;
    RadioGroup rGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switch1 = findViewById(R.id.switch1);
        rGroup = findViewById(R.id.radioGroup);
        if (switch1.isChecked()){
            getSelectedColor();
        }
    }
    public void clickedBlue(View view){
        if (switch1.isChecked()){
            getSelectedColor();
        }
    }
    public void clickedRed(View view){
        if (switch1.isChecked()){
            getSelectedColor();
        }
    }
    public void clickedYellow(View view){
        if (switch1.isChecked()){
            getSelectedColor();
        }
    }
    public void clickedMagenta(View view){
        if (switch1.isChecked()){
            getSelectedColor();
        }
    }
    public void clickedChange(View view) {
        if (!switch1.isChecked()){
            getSelectedColor();
        }
    }

    public void getSelectedColor() {
        int selectedRadioButtonId = rGroup.getCheckedRadioButtonId();
        if (selectedRadioButtonId == R.id.rbBlue)
            getWindow().getDecorView().setBackgroundColor(Color.BLUE);
        else if (selectedRadioButtonId == R.id.rbRed)
            getWindow().getDecorView().setBackgroundColor(Color.RED);
        else if (selectedRadioButtonId == R.id.rbYellow)
            getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
        else if (selectedRadioButtonId == R.id.rbGreen)
            getWindow().getDecorView().setBackgroundColor(Color.GREEN);
    }
}