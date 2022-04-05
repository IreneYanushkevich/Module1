package by.epam.yanushkevich_irina.module1;

public class BranchingTask5 {

    /* 5. Вычислить значение функции:
               | x^2-3x+9, если x<=3;
        F(x) = | 1/(x^3+6), если x>3. */

    public static void main(String[] args) {

        double x;
        double f;

        x = 4;

        if (x <= 3) {
            f = x * x - 3 * x + 9;
        } else {
            f = 1 / (x * x * x + 6);
        }

        System.out.println("F(x) = " + f);

    }
}
