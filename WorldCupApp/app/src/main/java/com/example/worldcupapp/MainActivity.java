package com.example.worldcupapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    private static CustomAdapter customAdapter;
    ArrayList<CountryModelClass> myArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView1);

        myArray = new ArrayList<>();

        myArray.add(new CountryModelClass("Germany", "4", R.drawable.germany));
        myArray.add(new CountryModelClass("France", "2", R.drawable.france));
        myArray.add(new CountryModelClass("Brazil", "5", R.drawable.brazil));


        customAdapter = new CustomAdapter(myArray, getApplicationContext());

        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Toast.makeText(MainActivity.this,
                        "Country: " + customAdapter.getItem(i).getCountry_name() + "\n" +
                                "World Cups wins: " + customAdapter.getItem(i).getCup_win_count(),
                        Toast.LENGTH_SHORT).show();

            }
        });


    }
}