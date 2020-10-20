package arraysOfArrays;

//3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

import java.util.Scanner;

public class NumThreeA {

    static int k;
    static int p;

    static void numberLine() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        if (sc.hasNextInt()) {
            k = sc.nextInt();
            if (k > DevUtilArray.n) {
                System.out.println("Вы превысили массив!");
                numberLine();
            }
        } else {
            System.out.println("Введите целое число");
            numberLine();
        }
    }

    static void numberColumn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите столбец:");
        if (sc.hasNextInt()) {
            p = sc.nextInt();
            if (p > DevUtilArray.n) {
                System.out.println("Вы превысили массив!");
                numberLine();
            }
        } else {
            System.out.println("Введите целое число");
            numberColumn();
        }
    }

    static void arraysLiAndCo(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == k - 1 | j == p - 1) {
                    if (a[i][j] < 10) {
                        System.out.print(a[i][j] + "  ");
                    } else {
                        System.out.print(a[i][j] + " ");
                    }
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DevUtilArray.arraysLength();
        int[][] array3 = new int[DevUtilArray.n][DevUtilArray.d];
        DevUtilArray.arraysPull(array3);
        DevUtilArray.arraysShow(array3);
        numberLine();
        numberColumn();
        arraysLiAndCo(array3);
    }
}
