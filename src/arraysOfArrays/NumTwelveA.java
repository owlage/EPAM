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
    static void sortArraysLineDescending(int[][] array) {
        System.out.println("Строки по возрастанию");
        //создаем массив длинной равной длине столбика,в нём будем сортировать каждую строку
        int[] arrayTwo = new int[DevUtilArray.column];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arrayTwo[j] = array[i][j];//в одномерный массив записываем значения из строки двумерного массива
                if (j == array[i].length - 1) {//доходим до конца строки и сортируем массив
                    Arrays.sort(arrayTwo);
                    for (int k = 0; k < array[i].length; k++) {//перезаписываем отсортированный массив в строку двумер
                        array[i][k] = arrayTwo[k];
                        if (array[i][k] < 10) {
                            System.out.print(array[i][k] + "  ");
                        } else {
                            System.out.print(array[i][k] + " ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }

    // отсортированные строки
    static void sortArraysLineAscending(int[][] array) {
        System.out.println("Строки убыванию");
        int index = 0;//счётчик длинны строки в двумерном массиве, потом будем использовать в качестве индекса массива
        //создаем массив длинной равной длине столбика,в нём будем сортировать каждую строку
        int[] arrayTwo = new int[DevUtilArray.column];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arrayTwo[j] = array[i][j];
                ++index;
                if (j == array[i].length - 1) {
                    Arrays.sort(arrayTwo);
                    for (int k = 0; k < array[i].length; k++) {//перезаписываем отсортированный массив в строку двумер
                        array[i][k] = arrayTwo[--index];
                        if (array[i][k] < 10) {//если цифра одна то добавляем пробел, для красоты вывода
                            System.out.print(array[i][k] + "  ");
                        } else {
                            System.out.print(array[i][k] + " ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        DevUtilArray.arraysLength();
        int[][] array12 = new int[DevUtilArray.line][DevUtilArray.column];
        DevUtilArray.arraysPull(array12);//заполняем массив
        DevUtilArray.arraysShow(array12);//отображаем массив
        System.out.println();
        // sortArrays(array12); //сортировка матрицы
        sortArraysLineDescending(array12);//сортировка строк по убыванию
        sortArraysLineAscending(array12);//сортировка строк по возрастанию
    }
}
