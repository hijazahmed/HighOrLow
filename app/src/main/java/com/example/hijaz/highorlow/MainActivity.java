package com.example.hijaz.highorlow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public void generateRandomNumber(){
        Random rand = new Random();
        randomNumber = rand.nextInt(10) +1;
    }
    int randomNumber;

    public void guess(View view){
        EditText editText=(EditText) findViewById(R.id.editText);
        int guessValue=Integer.parseInt(editText.getText().toString());
        String message;
        if(guessValue > randomNumber){
            message ="lower!";
        }
        else if (guessValue < randomNumber){
            message = "higher!";
        }
        else {
            message="you got it!";
            generateRandomNumber();
        }
        Toast.makeText(this, message,Toast.LENGTH_SHORT).show();
        Log.i("entered value",editText.getText().toString());
        Log.i("info" , Integer.toString(randomNumber));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateRandomNumber();

    }
}
