package com.example.volumeareaapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Sphere extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        EditText editText;
        TextView textView1, textViewResult;
        Button btn;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);


        editText=findViewById(R.id.editText_sphere);
        textView1=findViewById(R.id.textView2);
        textViewResult=findViewById(R.id.textView3);
        btn=findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String radius = editText.getText().toString();

                int r = Integer.parseInt(radius);

                double volume =(4/3)*Math.PI * r * r*r;

                textViewResult.setText("V= "+volume+" m^3");
            }
        });

    }
}