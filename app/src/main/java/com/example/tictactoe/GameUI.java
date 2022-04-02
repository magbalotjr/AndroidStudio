package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GameUI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_ui);
    }
    public void playAgainClick(View view){
        //code
    }
    public void homeButtonClick(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }


}