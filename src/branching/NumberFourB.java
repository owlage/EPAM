package branching;

/*4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
Определить, пройдет ли кирпич через отверстие.
 */

import java.util.Scanner;

public class NumberFourB {

    static double t, m, x, y, z;
    static double a;

    static double brick() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextDouble()) {
            a = sc.nextDouble();
            if (a == 0) {
                System.out.println("не правильно задан размер");
                brick();
            }
        } else {
            System.out.println("Введите число");
            brick();
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Введите разверы отверстия");
        System.out.println("Длинна");
        t = brick();
        System.out.println("Ширина");
        m = brick();
        System.out.println("Введите размеры кирпича");
        System.out.println("Длинна");
        x = brick();
        System.out.println("Ширина");
        y = brick();
        System.out.println("Глубина");
        z = brick();
        if (t >= x && m >= y || t >= y && m >= x || t >= x && m >= z || t >= z && m >= x ||
                t >= y && m >= z || t >= z && m >= y) {
            System.out.println("Кирпичь пройдет");
        } else {
            System.out.println("Кирпичь не пройдет");
        }
    }
}

