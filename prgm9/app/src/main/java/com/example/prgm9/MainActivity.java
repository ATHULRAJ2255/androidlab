package com.example.prgm9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText courseNameEdt, courseDurationEdt,courseDescriptionEdt;
    private Button addCourseBtn;
    private DBHandler dbHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        courseNameEdt = (EditText)findViewById(R.id.idEdtCourseName);
        courseDurationEdt = (EditText)findViewById(R.id.idEdtCourseDuration);
        courseDescriptionEdt =(EditText)findViewById(R.id.idEdtCourseDescription);
        addCourseBtn = (Button)findViewById(R.id.idBtnAddCourse);
        dbHandler = new DBHandler(MainActivity.this);
        addCourseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String courseName = courseNameEdt.getText().toString();
                String courseDuration =courseDurationEdt.getText().toString();
                String courseDescription = courseDescriptionEdt.getText().toString();
                if (courseName.isEmpty() &&courseDuration.isEmpty() && courseDescription.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter all the data..",
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                dbHandler.addNewCourse(courseName, courseDuration, courseDescription);
                Toast.makeText(MainActivity.this, "Course has been added.",Toast.LENGTH_SHORT).show();
                courseNameEdt.setText("");
                courseDurationEdt.setText("");
                courseDescriptionEdt.setText("");
            }
        });
    }
}