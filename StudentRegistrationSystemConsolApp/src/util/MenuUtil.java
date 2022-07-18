/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author 99470
 */
public class MenuUtil {

    public static void processMenu(int menu) {
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
    
    public static String requireName(){
        return InputUtil.requireText("Enter name");
    }
    
    public static String requireSurname(){
        return InputUtil.requireText("Enter surname");
    }
    
    public static String requireClassName(){
        return InputUtil.requireText("Enter classname");
    }
    
    public static int requireAge(){
        return InputUtil.requireNumber("Enter age");
    }
    
    public static void showSuccessOpMessage(){
        System.out.println("Registration operation succesfully");
    }
}
