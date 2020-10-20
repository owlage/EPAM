package linearPrograms;
/*
6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
        принадлежит закрашенной области, и false — в противном случае:
*/

import java.util.Scanner;

public class NumberSix {

    static double x, y;

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

    public static void main(String[] args) {
        number();
        if (x > -5.0 & x < -3.0 || x < 5.0 & x > 2.0) {
            if (y <= 0.0 && y > -4.0) {
                System.out.println("true");
            } else
                System.out.println("false");
        } else if (x >= -2.0 & x <= 2.0) {
            if (y >= -3.0 & y < 5.0) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }
    }
}



