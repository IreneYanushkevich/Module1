package by.epam.yanushkevich_irina.module1;

public class CycleTask2 {

    /* 2. Вычислить значения функции на отрезке [а,b] c шагом h:
            |x, x>2
         y= |-x, x<=2 */

    public static void main(String[] args) {

        int a;
        int b;
        int h;
        int y;

        a = -4;
        b = 17;
        h = 4;

        for (int x = a; x <= b; x += h) {

            if (x > 2) {
                y = x;
            } else {
                y = -x;
            }

            System.out.println("x= " + x + "; y= " + y);
        }

    }
}
