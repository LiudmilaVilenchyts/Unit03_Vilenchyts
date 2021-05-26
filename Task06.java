package by.epam.unit03.main;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        int x;
        int y;
        int i;
        int j;
        int count;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число Х>");
        x = sc.nextInt();
        System.out.println("Введите число Y>");
        y = sc.nextInt();
        String string1 = Integer.toString(x);
        String string2 = Integer.toString(y);
        String res = "";
        for (i = 0; i < string1.length(); i++) {
            for (j = 0; j < string2.length(); j++) {
                char char1 = string1.charAt(i);
                char char2 = string2.charAt(j);
                if (char1 == char2) {
                    if (!res.contains(Character.toString(char1))) {
                        res = res + char1;
                        break;
                    }
                }
            }
        }
        System.out.println("В запись обоих чисел входят цифры: " + res);


    }
}
