package linearPrograms;

//1. Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c.

import java.util.Scanner;

public class NumberOne {
    public static void number() {
        int a = 0, b = 0, c = 0;
        double z = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 3 целых числа через enter");
        if (sc.hasNextInt()) {
            a = sc.nextInt();
            if (sc.hasNextInt()) {
                b = sc.nextInt();
                if (sc.hasNextInt()) {
                    c = sc.nextInt();
                    z = (((double) a - 3) * (double) b / 2) + (double) c;
                    System.out.println("Итог: " + z);
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

