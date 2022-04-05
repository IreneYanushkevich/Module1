package by.epam.yanushkevich_irina.module1;

public class CycleTask3 {

    // 3. Найти сумму квадратов первых ста чисел.

    public static void main(String[] args) {

        int n;
        int sum;

        n = 100;
        sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }

        System.out.println("Sum of the squares of the first " + n + " numbers = " + sum);

    }
}
