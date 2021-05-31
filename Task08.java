package by.epam.unit03.main;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        int x, y;
        double z;
        String op;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Введите значение Х>");
            x = sc.nextInt();
            sc.nextLine();
            System.out.println("Введите значение Y>");
            y = sc.nextInt();
            sc.nextLine();
            System.out.println("Введите операнд чтобы продолжить или введите # для выхода из программы");
            op = sc.nextLine();
            switch (op) {
                case "+":
                    z = x + y;
                    System.out.println("Результат вычислений = " + z);
                    break;
                case "-":
                    z = x - y;
                    System.out.println("Результат вычислений = " + z);
                    break;
                case "/":
                    if (y != 0) {
                        z = x / y;
                        System.out.println("Результат вычислений = " + z);
                    } else {
                        System.out.println("Ахтунг! Деление на ноль. Попробуйте заново");
                    }
                    break;
                case "*":
                    z = x * y;
                    System.out.println("Результат вычислений = " + z);
                    break;
                case "#":
                    op = "#";
                    break;
                default:
                    System.out.println("Некорректный операнд детектед. Допустимые операнды +, -, *, /. Попробуйте заново");
                    break;

            }

        } while (op != "#");
        System.out.println("Вылючаем калькулятор");

    }


}// зачтено

