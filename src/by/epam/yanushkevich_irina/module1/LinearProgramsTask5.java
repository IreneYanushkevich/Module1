package by.epam.yanushkevich_irina.module1;

public class LinearProgramsTask5 {

    /* 5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
          данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc. */

    public static void main(String[] args) {

        int t;
        int h;
        int m;
        int s;

        t = 9279;

        h = t / 3600;
        m = t % 3600 / 60;
        s = t % 3600 % 60;

        System.out.println(h + "ч " + m + "мин " + s + "c");

    }
}
