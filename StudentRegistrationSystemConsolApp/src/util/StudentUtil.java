/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import bean.Student;
import main.Config;

/**
 *
 * @author 99470
 */
public class StudentUtil {
    public static Student fillStudent(){
        String name = InputUtil.requireText("Enter name");

                String surname = InputUtil.requireText("Enter surname");

                int age = InputUtil.requireNumber("Enter age");

                String className = InputUtil.requireText("Enter classname");

                Student students = new Student(name, surname, age, className);
                return students;
    }
    public static void printAllRegisteredStudents(){
        for (int i = 0; i < Config.students.length; i++) {
                Student students = Config.students[i];
                System.out.println(students.getName() + " " + students.getSurname() + " " + students.getAge() + " " + students.getClassName());

            }
    }
    public static void registerStudents(){
        int count = InputUtil.requireNumber("How many students will be enrolled?");
            Config.students = new Student[count];
            for (int i = 0; i < Config.students.length; i++) {
                System.out.println((i + 1) + ". Register");

                Config.students[i] = StudentUtil.fillStudent();

            }
            System.out.println("Registration completed succesfully");
            printAl
    }
}
