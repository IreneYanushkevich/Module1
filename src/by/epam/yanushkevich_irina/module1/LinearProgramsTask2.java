package by.epam.yanushkevich_irina.module1;

public class LinearProgramsTask2 {

    /* 2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
            ((b+√(𝑏^2+4*a*c))/2a)-(a^3)*c+b^(-2). */

    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double z;

        a = 0.6;
        b = 4.9;
        c = 1.2;

        z = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);

        System.out.println("z = " + z);

    }
}
