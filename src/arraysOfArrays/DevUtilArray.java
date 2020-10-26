package arraysOfArrays;

import java.util.Scanner;

class DevUtilArray {

    static int line, column;

    //ввод числа для квадратной матрицы
    static void arrayCube() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во строк в массива:");
        if (sc.hasNextInt()) {
            line = sc.nextInt();
        } else {
            System.out.println("Введите целое число");
            arraysLength();
        }
        if (line < 1) {
            arraysLength();
        }
    }

    //вывод массива
    static void arraysShow(int[][] arr) {
        System.out.println("Массив:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < 10) {//для красоты вывода вместо знака добавляем пробед
                    System.out.print(arr[i][j] + "  ");
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    //ввод строк и столбцов массива
    static void arraysLength() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во строк в массива:");
        if (sc.hasNextInt()) {
            line = sc.nextInt();
            System.out.println("Введите кол-во столбцов массива:");
            if (sc.hasNextInt()) {
                column = sc.nextInt();
            }
        } else {
            System.out.println("Введите целое число");
            arraysLength();
        }
        if (line < 1 || column < 1) {
            arraysLength();
        }
    }

    //заполнение массива
    static void arraysPull(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 99 + 1);
            }
        }

    }

}



