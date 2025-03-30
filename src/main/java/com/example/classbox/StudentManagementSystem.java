package com.example.classbox;

import com.example.classbox.entity.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args){
        StudentManagementSystem s = new StudentManagementSystem();
        s.start();
    }

    public void start() {
        boolean active = true;
        Scanner sc = new Scanner(System.in);
        while (active) {
            System.out.println("--- Student Management System ---" +
                    "\n1. Add Student\n2. View All Students" +
                    "\n3. Search Student by ID\n4. Update Student Details" +
                    "\n5. Delete Student Record\n6. Save Student to File\n" +
                    "7. Load Student From File\n8. Exit\nEnter your choice: ");
            switch (sc.nextInt()) {
                case 1:
                    addStudent();
                case 2:
                    viewStudents();
                case 3:
                    searchStudent();
                case 4:
                    updateStudent();
                case 5:
                    deleteStudent();
                case 6:
                    saveToFile();
                case 7:
                    loadFromFile();
                case 8:
                    active = false;
                default:
                    System.out.println("Invalid Input. Choose 1 - 8");
            }
        }
        System.exit(0);
    }

    private ArrayList<Student> studentList = new ArrayList<>();

    public Student addStudent(){

        //Student full name and education level
        String name, grade;
        int age, id;

        id = 0;
        id++;

        try(Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter student's first and last name: ");
            name = sc.nextLine();

            System.out.println("Enter student's age: ");
            age = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter student's grade level: ");
            grade = sc.nextLine();

            Student student = new Student(id, name, age, grade);

            studentList.add(student);
            return student;
        }

    }

    public void viewStudents(){
        studentList.forEach(System.out::println);
    }
    public void searchStudent(){}
    public void updateStudent(){};
    public void deleteStudent(){}
    public void saveToFile(){}
    public void loadFromFile(){}


}
