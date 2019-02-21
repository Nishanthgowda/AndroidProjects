package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
TextView countTv;
int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    countTv = findViewById(R.id.count);
    }
public void upBtnClicked (View view){
  count++;
  countTv.setText(""+count);
}
public void downBtnClicked (View view){
    count--;
    countTv.setText(""+count);
}
public void resetBtnClicked(View view){
        count=0;
    countTv.setText(""+count);
}
    public void randomBtnClicked(View view){
        Random random = new Random();
        if(count>0){
           int randomInt = random.nextInt(count);
            Toast.makeText(this,"Random : "+randomInt,Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this,"count cant be nagative",Toast.LENGTH_SHORT).show();
        }
    }
}

