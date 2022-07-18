package main;

import bean.Student;
import util.InputUtil;
import util.StudentUtil;

public class Main {

    public static void main(String[] args) {
        while (true) {
            int menu = InputUtil.requireNumber("What do you want to do?"
                    + "\n1. Register Student "
                    + "\n2. Show all students"
                    + "\n3. Find Students"
                    + "\n4. Update Student");
            if (menu == 1) {
                StudentUtil.registerStudents();
            } else {
                if (menu == 2) {
                    StudentUtil.printAllRegisteredStudents();
                } else {
                    if (menu == 3) {
                        StudentUtil.findAndPrintStudents();

                    } else {
                        if (menu == 4) {
                            StudentUtil.updateStudentWithSplit();

                        }
                    }
                }
            }

        }
    }
}
