package by.epam.unit03.main;

public class Task03 {
    public static void main(String[] args) {
        int x;
        int y=1;
        double res = 1;
        for (x=2;x<=10;x++){
            y = y+x; // сумма в скобочках (первая скобка)
            res = res*y;
        }
        System.out.println("Результат вычислений = "+res);
    }
}




