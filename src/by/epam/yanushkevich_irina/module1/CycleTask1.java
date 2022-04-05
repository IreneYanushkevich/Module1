package by.epam.yanushkevich_irina.module1;

import java.util.Scanner;

public class CycleTask1 {

    /* 1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
          все числа от 1 до введенного пользователем числа. */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum;
        int n;

        sum = 0;

        do {
            System.out.println("Enter a positive integer n >> ");

            while (!scanner.hasNextInt()) {
                System.out.println("Enter a positive integer n >> ");
                scanner.next();
            }
            n = scanner.nextInt();

        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("Sum of all integers from 1 to " + n + " = " + sum);

    }
}

