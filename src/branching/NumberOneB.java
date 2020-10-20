package branching;

/*1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
и если да, то будет ли он прямоугольным.
 */

import java.util.Scanner;

public class NumberOneB {

    static double a, b;

    static void twoDouble() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 угла через enter, угол не может быть меньше чем 1 и больше чем 179!");
        if (sc.hasNextDouble()) {
            a = sc.nextDouble();
            if (sc.hasNextDouble()) {
                b = sc.nextDouble();
                if (a < 1 || b < 1 || a >= 180 || b >= 180) {
                    twoDouble();
                }
            } else {
                System.out.println("Введите любое число от 1 до 179");
                twoDouble();
            }
        } else {
            System.out.println("Введите любое число от 1 до 179");
            twoDouble();
        }
    }


    public static void main(String[] args) {
        twoDouble();
        if (a + b <= 180) {
            System.out.println("Треугольник существует");
            if (a == 90 || b == 90 || (a + b) == 90) {
                System.out.println("Треугольник прямоугольный");
            }
        } else {
            System.out.println("Треугольника не существует");
        }
    }
}
