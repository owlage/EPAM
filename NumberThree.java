package linearPrograms;
/*
3.Вычислить значение выражения по формуле (все переменные принимают действительные значения):
infinuty - при одинаковых числа
 */

import java.util.Scanner;

public class NumberThree {

    static double x, y, z;

    public static void number() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 числа через enter");
        if (sc.hasNextDouble()) {
            x = sc.nextDouble();
            if (sc.hasNextDouble()) {
                y = sc.nextDouble();
            } else {
                System.out.println("Не допустимое значение");
                number();
            }
        } else {
            System.out.println("Не допустимое значение");
            number();
        }
    }

    static void formula() {
        z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.cos(y)) * Math.tan(x * y);
        if (!Double.isInfinite(z)) {
            System.out.println(z);
        } else {
            System.out.println("Введите 2 разных числа!");
            number();
        }
    }

    public static void main(String[] args) {
        number();
        formula();
    }
}


