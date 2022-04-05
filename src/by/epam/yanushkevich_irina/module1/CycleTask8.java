package by.epam.yanushkevich_irina.module1;

public class CycleTask8 {

    // 8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

    public static void main(String[] args) {

        int x;
        int y;
        int numbersY;
        int numbersX;
        int yClone;

        x = 56781;
        y = 123451;

        if (x < 0) {
            x = Math.abs(x);
        }

        if (y < 0) {
            y = Math.abs(y);
        }

        System.out.println("x and y have the same numbers: ");

        if (x == 0) {

            while (y > 0) {
                numbersY = y % 10;
                y = y / 10;
                if (numbersY == x) {
                    System.out.println(x);
                    break;
                }
            }
        }

        if (y == 0) {

            while (x > 0) {
                numbersX = x % 10;
                x = x / 10;
                if (numbersX == y) {
                    System.out.println(y);
                    break;
                }
            }
        }

        yClone = y;

        while (x > 0) {
            numbersX = x % 10;
            x = x / 10;
            y = yClone;

            while (y > 0) {
                numbersY = y % 10;
                y = y / 10;

                if (numbersY == numbersX) {
                    System.out.print(numbersY + " ");
                    break;
                }
            }
        }

        System.out.println();

    }
}
