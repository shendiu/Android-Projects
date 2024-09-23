package com.example.luckynumberapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    EditText editText;
    Button btn;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.textView);
        btn = findViewById(R.id.btn);
        editText = findViewById(R.id.edit_text);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = editText.getText().toString();

                //Expicit Intent
                Intent i = new Intent(
                        getApplicationContext(),
                        SecondActivity.class
                );

                userName = i.getStringExtra("name");
                if (userName == null) {
                    userName = "Guest"; // значення за замовчуванням, якщо ім'я не передано
                }

                // Passing the name to second activity
                i.putExtra("name", userName);

                startActivity(i);
            }
        });
    }
}