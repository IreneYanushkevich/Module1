package by.epam.yanushkevich_irina.module1;

public class CycleTask4 {

    // 4. Составить программу нахождения произведения квадратов первых двухсот чисел.

    public static void main(String[] args) {

        int n;
        long num;

        n = 200;
        num = 1;

        for (int i = 2; i <= n; i++) {

            if (num < 0) {
                i--;
                System.out.println("! Overflow occurs when i = " + i + "!");
                break;
            }

            num = num * i * i;

            System.out.println("The product of the squares of the first " + i + " numbers = " + num);
        }

    }
}
