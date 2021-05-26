package by.epam.unit03.main;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rim;
        System.out.println("Введите римскую цифру> ");
        rim = sc.nextLine();
        switch (rim) {
            case "I":
                System.out.println(rim + " - 1");
                break;
            case "V":
                System.out.println(rim + " - 5");
                break;
            case "X":
                System.out.println(rim + " - 10");
                break;
            case "L":
                System.out.println(rim + " - 50");
                break;
            case "C":
                System.out.println(rim + " - 100");
                break;
            case "D":
                System.out.println(rim + " - 500");
                break;
            case "M":
                System.out.println(rim + " - 1000");
                break;
            default:
                System.out.println("Вы ввели не римскую цифру");
                break;
        }

    }
}



