package com.digit.logical;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentMarksSort {
    @Setter
    @Getter
    private String name;
    @Setter
    @Getter
    private int marks;

    public StudentMarksSort(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "StudentMarksSort{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("Sam",95));
        students.add(new Student("Ayu",35));
        students.add(new Student("Raju",75));
        students.add(new Student("Kapu",50));

        System.out.println(students);
        //Sort students by their marks
        Collections.sort(students, Comparator.comparingInt(Student::getMarks));

        //Print sorted list of students by their mark
        for (Student s:students){
            System.out.println("Sorted list of students by their marks :" + s);

        }
    }






}
