package com.example.topgamesapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    ArrayList<Game> gameList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerView);
        gameList = new ArrayList<>();
        gameList.add(new Game("Horizon Chase", R.drawable.card1));
        gameList.add(new Game("Pubg", R.drawable.card2));
        gameList.add(new Game("Head BALL 2", R.drawable.card3));
        gameList.add(new Game("Hooked on you", R.drawable.card4));
        gameList.add(new Game("Fifa 2022", R.drawable.card5));
        gameList.add(new Game("Fortnite", R.drawable.card6));


        adapter = new Adapter(getApplicationContext(), gameList);
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}