package com.example.viewmodelapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button btn;
    MainActivityViewModel mainActivityViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        textView=findViewById(R.id.textView);
        btn = findViewById(R.id.btn);

        mainActivityViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);

//        textView.setText("You clicked: " + mainActivityViewModel.getInitialCounter() + " Times");


        //Using Live Data to get the counter
        LiveData<Integer> count = mainActivityViewModel.getInitialCounter();
        count.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                textView.setText("You clicked: "+ integer + " Times");
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // textView.setText("You clicked: " + mainActivityViewModel.getCounter() + " Times");;
                mainActivityViewModel.getCounter();
            }
        });
    }
}