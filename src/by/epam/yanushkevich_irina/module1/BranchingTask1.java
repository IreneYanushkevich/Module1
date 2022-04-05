package by.epam.yanushkevich_irina.module1;

public class BranchingTask1 {

    /* 1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
          он прямоугольным. */

    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double sum;

        a = 45.7;
        b = 90.0;

        sum = a + b;
        c = 180 - sum;

        if (sum < 180) {
            System.out.println("This triangle exists. ");
            if (a == 90 || b == 90 || c == 90) {
                System.out.println("And this triangle is right angled.");
            } else {
                System.out.println("But this triangle is not right angled.");
            }
        } else {
            System.out.println("This triangle doesn't exists.");
        }

    }
}
