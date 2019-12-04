package com.example.studentexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Student> students = new ArrayList<>();
    private RecyclerView rv_student;
    private StudentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initData();
        adapter = new StudentAdapter(this, students);
        rv_student.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        rv_student.setAdapter(adapter);
    }

    private void initData() {
        students.add(new Student(1, "Student 1", "2", 0.0f));
        students.add(new Student(2, "Student 2", "3", 0.0f));
        students.add(new Student(3, "Student 3", "1", 0.0f));
        students.add(new Student(4, "Student 4", "3", 0.0f));
        students.add(new Student(5, "Student 5", "2", 0.0f));
    }

    private void initViews() {
        rv_student = findViewById(R.id.rv_students);
    }
}
