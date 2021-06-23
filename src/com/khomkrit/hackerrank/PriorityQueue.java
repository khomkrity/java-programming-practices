package com.khomkrit.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student student) {
        // sort cgpa => descending order
        int result = Double.compare(student.getCgpa(), this.cgpa);
        // if grades are equal
        if (result == 0) {
            // sort name => ascending order
            result = this.name.compareTo(student.getName());
            // if names are the same
            if (result == 0) {
                // sort id => ascending order
                result = student.getId() - this.id;
            }
        }
        return result;
    }
}

class Priority {
    public static List<Student> getStudents(List<String> events) {
        List<Student> students = new ArrayList<>();
        for (String event : events) {
            if (event.contains("ENTER")) {
                String[] studentInfo = event.split(" ");
                String studentName = studentInfo[1];
                double studentGrade = Double.parseDouble(studentInfo[2]);
                int studentId = Integer.parseInt(studentInfo[3]);
                students.add(new Student(studentId, studentName, studentGrade));
            } else {
                if (!students.isEmpty()) {
                    Collections.sort(students);
                    students.remove(0);
                }
            }
        }
        return students;
    }
}

public class PriorityQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfEvents = Integer.parseInt(scanner.nextLine());
        List<String> events = new ArrayList<>();
        for (int i = 0; i < numberOfEvents; i++) {
            String event = scanner.nextLine();
            events.add(event);
        }
        scanner.close();
        List<Student> students = Priority.getStudents(events);
        if (!students.isEmpty()) {
            for (Student student : students) {
                System.out.println(student.getName());
            }
        } else {
            System.out.println("EMPTY");
        }
    }
}
