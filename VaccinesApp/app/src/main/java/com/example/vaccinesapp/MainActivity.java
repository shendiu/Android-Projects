package com.example.vaccinesapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    RecyclerView recyclerView;
    VaccineModelClass myData[];
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        myData = new VaccineModelClass[]{
                new VaccineModelClass("1", R.drawable.vaccine1),
                new VaccineModelClass("2", R.drawable.vaccine4),
                new VaccineModelClass("3", R.drawable.vaccine5),
                new VaccineModelClass("4", R.drawable.vaccine6),
                new VaccineModelClass("5", R.drawable.vaccine7),
                new VaccineModelClass("6", R.drawable.vaccine8),
                new VaccineModelClass("7", R.drawable.vaccine9)
        };

        customAdapter = new CustomAdapter(myData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



        recyclerView.setAdapter(customAdapter);


        customAdapter.setClickListener(this);



    }

    @Override
    public void onClick(View view, int position) {
        Toast.makeText(this,
                "Vaccine name: " + myData[position].getTitle(),
                Toast.LENGTH_SHORT).show();
    }
}