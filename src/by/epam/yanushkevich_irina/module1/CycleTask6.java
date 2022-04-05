package by.epam.yanushkevich_irina.module1;

public class CycleTask6 {

    // 6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

    public static void main(String[] args) {

        char ch;

        for (int i = 33; i <= 255; i++) {
            ch = (char) i;
            String oct = Integer.toOctalString(i);
            String hex = Integer.toHexString(i);
            System.out.println("i = " + i + "; symbol " + ch + "  OCT " + oct + "  HEX " + hex);
        }

    }
}
