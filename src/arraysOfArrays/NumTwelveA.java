package arraysOfArrays;

// 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

import java.util.Arrays;

public class NumTwelveA {
    //Сортировка матрицы
/*
    static void sortArrays(int[][] a) {
        int index = 0;
        int[] arrayOne = new int[DevUtilArray.n * DevUtilArray.d];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                arrayOne[index++] = a[i][j];
            }
        }
        index = 0;
        Arrays.sort(arrayOne);
        System.out.println("Матрица по возрастанию:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = arrayOne[index++];
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        index = index - 1;
        System.out.println("Матрица по убыванию:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = arrayOne[index--];
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
*/
    // отсортированные строки
    static void sortArraysLineDescending(int[][] a) {
        System.out.println("Строки по возрастанию");
        int[] arrayTwo = new int[DevUtilArray.d];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                arrayTwo[j] = a[i][j];
                if (j == a[i].length - 1) {
                    Arrays.sort(arrayTwo);
                    for (int k = 0; k < a[i].length; k++) {
                        a[i][k] = arrayTwo[k];
                        if (a[i][k] < 10) {
                            System.out.print(a[i][k] + "  ");
                        } else {
                            System.out.print(a[i][k] + " ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }

    static void sortArraysLineAscending(int[][] a) {
        System.out.println("Строки убыванию");
        int index = 0;
        int[] arrayTwo = new int[DevUtilArray.d];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                arrayTwo[j] = a[i][j];
                ++index;
                if (j == a[i].length - 1) {
                    Arrays.sort(arrayTwo);
                    for (int k = 0; k < a[i].length; k++) {
                        a[i][k] = arrayTwo[--index];
                        if (a[i][k] < 10) {
                            System.out.print(a[i][k] + "  ");
                        } else {
                            System.out.print(a[i][k] + " ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        DevUtilArray.arraysLength();
        int[][] array12 = new int[DevUtilArray.n][DevUtilArray.d];
        DevUtilArray.arraysPull(array12);
        DevUtilArray.arraysShow(array12);
        System.out.println();
        // sortArrays(array12); //сортировка матрицы
        sortArraysLineDescending(array12);
        sortArraysLineAscending(array12);
    }
}
