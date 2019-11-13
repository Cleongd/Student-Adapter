package com.example.myapplication02112019.dataModels;

public class Student {
    private String studentName;
    private String studentID;
    private String studentCourse;


    public Student(){
       //Empty Constructor
    }

    public Student(String name, String id, String course){
        this.studentName = name;
        this.studentID = id;
        this.studentCourse = course;
    }

    public String getStudentName() {
        return studentName;
    }
    public String getStudentID() {
        return studentID;
    }
     public String getStudentCourse() {
         return studentCourse;
     }

     public void setStudentName(String name){
        this.studentName = name;
     }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}



