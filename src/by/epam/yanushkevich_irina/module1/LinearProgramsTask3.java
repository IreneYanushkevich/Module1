package by.epam.yanushkevich_irina.module1;

public class LinearProgramsTask3 {

    /* 3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
             ((𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦)/(𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦)) * 𝑡𝑔 𝑥𝑦. */

    public static void main(String[] args) {

        double x;
        double y;
        double z;

        x = 45.6;
        y = 18.9;

        z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);

        System.out.println("z = " + z);

    }
}

