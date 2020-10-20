package cycles;

//2. Вычислить значения функции на отрезке [а,b] c шагом h:

import java.util.Scanner;

public class NumberTwoC {
    static double a, b, h, y;

        public static void number() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите 3 целых числа через enter");
            if (sc.hasNextDouble()) {
                a = sc.nextDouble();
                if (sc.hasNextDouble()) {
                    b = sc.nextDouble();
                    if (sc.hasNextDouble()) {
                        h = sc.nextDouble();
                        for (double i = a; i <= b; i += h) {
                            if (i > 2) {
                                y = i;
                            } else {
                                y = i * (-1);
                            }
                            System.out.println("При х = " + i + " у = " + y);
                        }
                        System.out.println();
                    } else {
                        System.out.println("Не допустимое значение");
                        number();
                    }
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

    }
}






