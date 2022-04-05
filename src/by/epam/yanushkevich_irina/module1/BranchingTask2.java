package by.epam.yanushkevich_irina.module1;

public class BranchingTask2 {

    // 2. Найти max{min(a, b), min(c, d)}.

    public static void main(String[] args) {

        int a;
        int b;
        int c;
        int d;
        int min1;
        int min2;
        int max;

        a = 123;
        b = 234;
        c = 45;
        d = 800;

        if (a < b) {
            min1 = a;
        } else {
            min1 = b;
        }

        if (c < d) {
            min2 = c;
        } else {
            min2 = d;
        }

        if (min1 > min2) {
            max = min1;
        } else {
            max = min2;
        }

        System.out.println(max);

    }
}
