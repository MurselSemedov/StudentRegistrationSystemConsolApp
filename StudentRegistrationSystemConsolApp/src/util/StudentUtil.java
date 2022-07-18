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

    public static Student fillStudent() {
        String name = MenuUtil.requireName();

        String surname = MenuUtil.requireSurname();

        int age = MenuUtil.requireAge();

        String className = MenuUtil.requireClassName();

        Student students = new Student(name, surname, age, className);
        return students;
    }

    public static void printAllRegisteredStudents() {
        if (Config.students == null) {
            return;
        }
        for (int i = 0; i < Config.students.length; i++) {
            Student students = Config.students[i];
            System.out.println((i + 1) + ". " + students.getFullInfo());

        }
    }

    public static void registerStudents() {
        int count = InputUtil.requireNumber("How many students will be enrolled?");
        Config.students = new Student[count];
        for (int i = 0; i < Config.students.length; i++) {
            System.out.println((i + 1) + ". Register");

            Config.students[i] = StudentUtil.fillStudent();

        }
        MenuUtil.showSuccessOpMessage();
        printAllRegisteredStudents();
    }

    public static void findAndPrintStudents() {
        String text = InputUtil.requireText("");
        for (int i = 0; i < findStudents(text).length; i++) {
            Student st = findStudents(text)[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text) || Integer.toString(st.getAge()).contains(text)) {
                System.out.println(st.getFullInfo());
            }
        }
    }

    public static Student[] findStudents(String text) {
        int count = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text) || Integer.toString(st.getAge()).contains(text)) {
                count++;
            }
        }
        Student[] student = new Student[count];

        int found = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text) || Integer.toString(st.getAge()).contains(text)) {
                student[found++] = st;
            }
        }
        return student;
    }

    public static void updateStudentWithSameObject() {
        int index = InputUtil.requireNumber("Nechenci adamda deyisiklik etmek istiyirsiniz?");
        Student student = Config.students[index - 1];
        String params = InputUtil.requireText("Neleri deyismek isteyirsiniz,Meselen:'name','surname'");
        if (params.contains("'name'")) {
            student.setName(MenuUtil.requireName());
        }

        if (params.contains("'surname'")) {
            student.setSurname(MenuUtil.requireSurname());
        }
        if (params.contains("'classname'")) {
            student.setClassName(MenuUtil.requireClassName());
        }
        if (params.contains("'age'")) {
            student.setAge(MenuUtil.requireAge());
        }
    }

    public static void updateStudentWithNewObject() {
        StudentUtil.printAllRegisteredStudents();
        int index = InputUtil.requireNumber("Nechenci adamda deyisiklik etmek istiyirsiniz?");
        Config.students[index - 1] = StudentUtil.fillStudent();
    }

    public static void updateStudentWithSplit() {
        int index = InputUtil.requireNumber("Nechenci adamda deyisiklik etmek istiyirsiniz?");
        Student student = Config.students[index - 1];
        String params = InputUtil.requireText("Neleri deyismek isteyirsiniz,Meselen:name,surname");
        String[] parameters = params.split(",");
        for (int i = 0; i < parameters.length; i++) {
            if (parameters[i].equalsIgnoreCase("name")) {
                student.setName(MenuUtil.requireName());
            }

            if (parameters[i].equalsIgnoreCase("surname")) {
                student.setSurname(MenuUtil.requireSurname());
            }
            if (parameters[i].equalsIgnoreCase("classname")) {
                student.setClassName(MenuUtil.requireClassName());
            }
            if (parameters[i].equalsIgnoreCase("age")) {
                student.setAge(MenuUtil.requireAge());
            }
        }
    }
}
