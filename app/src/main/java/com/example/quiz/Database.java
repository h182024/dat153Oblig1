package com.example.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


public class Database extends AppCompatActivity {

    private RecyclerView database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);

        database= findViewById(R.id.DatabaseRecView);
        database.setHasFixedSize(true);
        database.setLayoutManager(new LinearLayoutManager(this));

    }
}
