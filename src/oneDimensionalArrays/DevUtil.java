package oneDimensionalArrays;

import java.util.Scanner;

class DevUtil {

    static int n;

    static void arrLength() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длинну массива: не отрицательное и не равное нуль!");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n <= 0) {
                    System.out.println("Введите не отрицательное и не равное нуль число!");
                    arrLength();
                }
            } else {
                System.out.println("Введите целое число!");
                arrLength();
            }
        }


    static void arrayPull(int[] a) {
        System.out.println("Массив:");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = i + 1;
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void output(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }


}