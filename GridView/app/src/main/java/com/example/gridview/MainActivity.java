package com.example.gridview;

import android.os.Bundle;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

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

        gridView = findViewById(R.id.gridView);
        ArrayList<CourseModel>  courseModelArrayList =new ArrayList<CourseModel>();
        courseModelArrayList.add(new CourseModel(R.drawable.course1,"Course 1"));
        courseModelArrayList.add(new CourseModel(R.drawable.course2,"Course 2"));
        courseModelArrayList.add(new CourseModel(R.drawable.course3,"Course 3"));
        courseModelArrayList.add(new CourseModel(R.drawable.course4,"Course 4"));

        MyAdapter myAdapter = new MyAdapter(this,courseModelArrayList);

        gridView.setAdapter(myAdapter);

    }
}