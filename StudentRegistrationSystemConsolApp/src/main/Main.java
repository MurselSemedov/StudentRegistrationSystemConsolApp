package main;

import util.InputUtil;
import util.MenuUtil;

public class Main {

    public static void main(String[] args) {
        while (true) {
            int menu = InputUtil.requireNumber("What do you want to do?"
                    + "\n1. Register Student "
                    + "\n2. Show all students"
                    + "\n3. Find Students"
                    + "\n4. Update Student");
           MenuUtil.processMenu(menu);

        }
    }
}
