package util;

import java.util.Scanner;

public class InputUtil {

    public static String requireText(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.print(title + ":");
        String text = sc.nextLine();

        return text;
    }

    public static int requireNumber(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.print(title + ":");
        int text = sc.nextInt();

        return text;
    }
}
