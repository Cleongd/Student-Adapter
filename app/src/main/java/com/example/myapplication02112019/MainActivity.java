package com.example.myapplication02112019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.myapplication02112019.dataModels.Student;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listViewStudents;
    private ArrayList<Student> arrayListStudent = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewStudents = findViewById(R.id.listViewStudent);

        arrayListStudent.add(new Student("Ng Kar Chun", "DIT1111", "Computer Science"));
        arrayListStudent.add(new Student("Gaben", "DIT2222", "Cybersecurity"));
        arrayListStudent.add(new Student("John", "DIT3333", "E-sports"));
        arrayListStudent.add(new Student("Mark Zuckerberg", "DIT4444", "Facebook"));

        StudentAdapter adapter = new StudentAdapter(arrayListStudent, this);

        listViewStudents.setAdapter(adapter);

        listViewStudents.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Student student = (Student) parent.getAdapter().getItem(position);

                Intent i = new Intent(MainActivity.this, StudentProfileActivity.class);
                i.putExtra("name", student.getStudentName());
                i.putExtra("id", student.getStudentID());
                i.putExtra("course", student.getStudentCourse());
                startActivity(i);
            }
        });
    }
}
