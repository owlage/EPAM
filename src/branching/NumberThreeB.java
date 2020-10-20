package branching;

//3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

import java.util.Scanner;

public class NumberThreeB {

    static double x1, y1, x2, y2, x3, y3;
    static double a;

    static double scan() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextDouble()) {
            a = sc.nextDouble();
        } else {
            System.out.println("Введите число");
            scan();
        }
        return a;
    }

    public static void main(String[] args) {

        System.out.println("Введите координаты точки №1");
        x1 = scan();
        y2 = scan();
        System.out.println("Введите координаты точки №2");
        x2 = scan();
        y2 = scan();
        System.out.println("Введите координаты точки №3");
        x3 = scan();
        y3 = scan();

        if ((x1 - x3) / (x2 - x3) == (y1 - y3) / (y2 - y3)) {
            System.out.println("Точки находятся на одной прямой");
        } else {
            System.out.println("Точки не лежат на одной прямой");
        }
    }
}