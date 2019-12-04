package com.example.studentexample;

public class Student {
    private int id;
    private String name, level;
    private float avg;

    public Student() {
    }

    public Student(int id, String name, String level, float avg) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.avg = avg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }
}
