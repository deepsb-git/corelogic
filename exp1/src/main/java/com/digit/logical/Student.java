package com.digit.logical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
   private String name;
   private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("Sam",50));
        students.add(new Student("Ram",60));
        students.add(new Student("Ayu",10));
        students.add(new Student("Chi",80));
        students.add(new Student("Saikh",90));

        System.out.println(students);

        //It will sort student after that compare will process
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getMarks(), o2.getMarks());
            }
        });
         //This line checks if the size of the students list is at least 3.
        //students.size() returns the number of elements in the list.
        //The condition >= 3 ensures that there are at least three students in the list.
        if (students.size()>=3){
            //Retrieving the third highest from the student list
            Student thirdHighest = students.get(2);
            System.out.println("Student third highest :" + thirdHighest);
        }else{
            System.out.println("Not enough student to determine highest marks");
        }


    }

}
