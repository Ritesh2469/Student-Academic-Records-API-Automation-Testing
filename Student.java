package com.studentapi.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class Student {
    @Pattern(regexp = "S\\d{4}", message = "Student ID must be in format S followed by 4 digits")
    private String id;

    @NotBlank(message = "Name cannot be blank")
    private String name;

    private double[] grades;
    private double gpa;

    public Student() {}

    public Student(String id, String name, double[] grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
        this.gpa = calculateGPA();
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double[] getGrades() { return grades; }
    public void setGrades(double[] grades) {
        this.grades = grades;
        this.gpa = calculateGPA();
    }

    public double getGpa() { return gpa; }

    private double calculateGPA() {
        if (grades == null || grades.length == 0) return 0.0;
        double sum = 0;
        for (double grade : grades) sum += grade;
        return Math.round((sum / grades.length) * 100.0) / 100.0;
    }
}
