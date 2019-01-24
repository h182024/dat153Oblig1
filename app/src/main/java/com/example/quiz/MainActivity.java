package com.example.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setting up intent to link up activities
        Button DatabaseActivityBtn = (Button)findViewById(R.id.DatabaseBtn);
        DatabaseActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Database.class);
                startActivity(startIntent);
            }
        });

        Button QuizActivityBtn = (Button)findViewById(R.id.QuizBtn);
        QuizActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent2 = new Intent(getApplicationContext(), Quiz.class);
                startActivity(startIntent2);
            }
        });

        Button AddActivityBtn = (Button)findViewById(R.id.AddBtn);
        AddActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent3 = new Intent(getApplicationContext(), Add.class);
                startActivity(startIntent3);
            }
        });
    }
}
