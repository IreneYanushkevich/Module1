package by.epam.yanushkevich_irina.module1;

public class CycleTask5 {

    /* 5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
          заданному е. Общий член ряда имеет вид:   an = 1/(2^n) + 1/(3^n). */

    public static void main(String[] args) {

        int n;
        double e;
        double sum;
        double a;

        n = 10;
        e = -0.25;
        sum = 0;

        for (int i = 1; i <= n; i++) {
            a = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));
            System.out.println("i=" + i + ", a=" + a);

            if (Math.abs(a) >= e) {
                sum += a;
            }
        }

        System.out.println("Sum of all |a| > e = " + sum);

    }
}