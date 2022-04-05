package by.epam.yanushkevich_irina.module1;

public class BranchingTask4 {

    /* 4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
о         отверстие. */

    public static void main(String[] args) {

        int a;
        int b;
        int x;
        int y;
        int z;

        a = 15;
        b = 25;
        x = 10;
        y = 8;
        z = 22;

        if (Math.min(x, Math.min(y, z)) < Math.min(a, b) && (Math.max(x, Math.max(y, z)) < Math.max(a, b))) {
            System.out.println("The brick is placed in the hole.");
        } else {
            System.out.println("Unfortunately, the brick isn't placed in the hole.");
        }

    }
}
