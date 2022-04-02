package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class playerName extends AppCompatActivity {

    private EditText p1;
    private EditText p2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_name);

        p1 = findViewById(R.id.editTextTextPersonName);
        p2 = findViewById(R.id.editTextTextPersonName2);
    }
    public void playButtonClick(View view){
        String player1Name = p1.getText().toString();
        String player2Name = p2.getText().toString();

        Intent intent = new Intent(this,GameUI.class);
        intent.putExtra("PLAYER_NAMES", new String[]{player1Name, player2Name});
        startActivity(intent);
    }
}