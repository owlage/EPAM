package linearPrograms;
/*
5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное значение
 длительности в часах, минутах и секундах в следующей форме:
 */

import java.util.Scanner;

public class NumberFive {

    static int a;

    static void second() {
        System.out.println("Введите кол-во секунд");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            a = sc.nextInt();
        } else {
            System.out.println("Введите кол-во секунд в цифрах, число должно быть целое!");
            second();
        }
    }

    static void hour() {
        int hh = a / 3600;
        int mm = (a % 3600) / 60;
        int ss = ((a % 3600) % 60);

        System.out.println("hh = " + hh + ";" + "mm = " + mm + ";" + "ss = " + ss);

    }

    public static void main(String[] args) {
        second();
        hour();
    }
}

