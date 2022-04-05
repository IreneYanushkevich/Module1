package by.epam.yanushkevich_irina.module1;

import java.util.Scanner;

public class CycleTask7 {

    /* 7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
          m и n вводятся с клавиатуры. */

    public static void main(String[] args) {

        int m;
        int n;
        int temp;

        m = scan("Enter a positive integer m >> ");
        n = scan("Enter a positive integer n >> ");

        if (m > n) {
            temp = m;
            m = n;
            n = temp;
        }

        while (m <= n) {
            System.out.print("Number " + m + " has divisors: ");

            for (int j = 2; j <= m / 2; j++) {

                if (m % j == 0) {
                    System.out.print(j + " ");
                }
            }
            m++;
            System.out.println();
        }
    }

    public static int scan(String invitation) {

        Scanner scanner = new Scanner(System.in);

        int res;

        do {
            System.out.println(invitation);

            while (!scanner.hasNextInt()) {
                System.out.println(invitation);
                scanner.next();
            }
            res = scanner.nextInt();

        } while (res <= 0);

        return res;

    }
}