package by.epam.unit03.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        double x1, x2, h, f, x, temp;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введите нижний предел диапазона>");
            x1 = sc.nextDouble();
            sc.nextLine();
            System.out.println("Введите верхний предел диапазона>");
            x2 = sc.nextDouble();
            sc.nextLine();
            System.out.println("Введите шаг>");
            h = sc.nextDouble();
            if (x1 > x2) { //проверяем что нижний и верхний пределы введены в правильном порядке; если нет - меняем местами
                temp = x1;
                x1 = x2;
                x2 = temp;
                System.out.println("Нижний предел - " + x1 + "\n" + "Верхний предел - " + x2);
            }
            x = x1;
            System.out.println("-------------------------");
            System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "f(x)");
            System.out.println("-------------------------");
            while (x <= x2) {
                f = 2 * Math.tan(x / 2) + 1;
                System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, f);
                x = x + h;
            }
            System.out.println("-------------------------");
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число");

        }

    }
}
