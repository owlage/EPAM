package arraysOfArrays;

import java.util.Scanner;

class DevUtilArray {

    //static Scanner sc = new Scanner(System.in);
    static int n, d;

    static void arraysShow(int[][] a) {
        System.out.println("Массив:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < 10) {
                    System.out.print(a[i][j] + "  ");
                } else {
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    static void arraysLength() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во строк в массива:");
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        } else {
            System.out.println("Введите целое число");
            arraysLength();
        }
        System.out.println("Введите кол-во столбцов массива:");
        if (sc.hasNextInt()) {
            d = sc.nextInt();
        } else {
            System.out.println("Введите целое число");
            arraysLength();
        }
        if (n < 1 || d < 1) {
            arraysLength();
        }
    }

    static void arraysPull(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 99 + 1);
            }
        }

    }

}



