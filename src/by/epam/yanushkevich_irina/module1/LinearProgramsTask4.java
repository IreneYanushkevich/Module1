package by.epam.yanushkevich_irina.module1;

public class LinearProgramsTask4 {

    /* 4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
          дробную и целую части числа и вывести полученное значение числа. */

    public static void main(String[] args) {

        double a;
        double b;
        double c;

        a = 555.789;

        b = (int) a;
        c = (a * 1000) % 1000 + b / 1000;

        System.out.println(c);

    }
}
