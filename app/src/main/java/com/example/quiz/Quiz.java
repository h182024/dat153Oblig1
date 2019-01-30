package com.example.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Quiz extends AppCompatActivity {

    public boolean compare (String name1, String name2){
        if (name1 == name2){
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        //the amount of right answers and answers themself

         private int score;
         private int amount;
         private int right;


        Button NextBtn = (Button)findViewById(R.id.NextBtn);
        NextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText name = (EditText) findViewById(R.id.NameEditText);
                if(compare(name, )){
                    right++;
                    amount++:
                } else {
                amount++;}
                Intent startIntent2 = new Intent(getApplicationContext(), Quiz.class);
                startActivity(startIntent2);
            }
        });

        Button QuitBtn = (Button)findViewById(R.id.QuitBtn);
        QuitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Result.class);
                startActivity(startIntent);

            }
        });

    }
}
