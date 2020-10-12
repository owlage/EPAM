package linearPrograms;
/*
5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное значение
 длительности в часах, минутах и секундах в следующей форме:
 */

import java.util.Scanner;

public class NumberFive {

    static void hour(double a){
        int hh = (int) a / 3600;
        int mm = (int) (a % 3600) / 60;
        int ss = (int) ((a % 3600) % 60);

        System.out.println("hh = " + hh + ";" + "mm = " + mm + ";" + "ss = " + ss);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();

        hour(a);
    }
}
