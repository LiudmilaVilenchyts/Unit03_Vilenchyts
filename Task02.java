package by.epam.unit03.main;

public class Task02 {
    public static void main(String[] args) {
        int x = 1;
        int sum = 0;
        while (x <= 99) {
            sum = sum + x;
            x = x + 2;
        }
        System.out.println("Сумма чисел равна " + sum);
    }
}
