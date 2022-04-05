package by.epam.yanushkevich_irina.module1;

public class LinearProgramsTask6 {

    /* 6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
          принадлежит закрашенной области, и false — в противном случае. */

    public static void main(String[] args) {

        double x;
        double y;
        boolean b;

        x = 4;
        y = 1;

        b = !(x > 4 || x < -4 || y < -3 || y > 4 || (x > 2 && y > 0) || (x < -2 && y > 0));

        System.out.println("Hitting the area: " + b);

    }

}
