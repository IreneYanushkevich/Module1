package by.epam.yanushkevich_irina.module1;

public class BranchingTask3 {

    // 3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

    public static void main(String[] args) {

        double x1;
        double y1;
        double x2;
        double y2;
        double x3;
        double y3;

        x1 = 2.9;
        y1 = 0.6;
        x2 = 4.8;
        y2 = 6.7;
        x3 = 5.0;
        y3 = 1.2;

        if ((x3 - x1) * (y2 - y1) == (y3 - y1) * (x2 - x1)) {
            System.out.println("All three points are on the one line.");
        } else {
            System.out.println("This three points aren't on the one line.");
        }

    }
}
