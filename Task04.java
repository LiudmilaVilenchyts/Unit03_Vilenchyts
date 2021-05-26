package by.epam.unit03.main;

public class Task04 {
    public static void main(String[] args) {
        double y;
        double x1 = -5;
        double x2 = 5;
        double h = 0.5;
        System.out.println("-------------------------");
        System.out.printf("|\t%4s\t|\t%4s\t|\n","x", "y");
        System.out.println("-------------------------");
        for (x1 = -5; x1 <= x2; x1 = x1 + h) {
            y = 5 - (Math.pow(x1, 2) / 2);
            System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n",x1, y);
        }
        System.out.println("-------------------------");
    }
}
