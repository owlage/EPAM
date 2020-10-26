package arraysOfArrays;
/*
9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец содержит
максимальную сумму.
 */

public class NumNineA {

    //определение максимальной суммы
    static int sumColumn(int[][] array) {
        int sumMax1 = 0;
        int sumMax2 = 0;
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                sumMax1 += array[j][i];
            }
            if (sumMax2 < sumMax1) {
                sumMax2 = sumMax1;
            }
            sumMax1 = 0;
        }

        return sumMax2;
    }

    //определение столбца с макс суммой
    static int columnMaxSum(int[][] array, int maxSum) {
        int numColumn = 0;//переменая хранит в себе номер стобца
        int sumMax1 = 0;
        int counterColumn = 0;//счётчик стобца
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                sumMax1 += array[j][i];
                if (maxSum == sumMax1) {
                    numColumn = counterColumn;
                }
            }
            counterColumn++;
            sumMax1 = 0;
        }
        return numColumn + 1;
    }

    public static void main(String[] args) {
        DevUtilArray.arraysLength();
        int[][] array9 = new int[DevUtilArray.line][DevUtilArray.column];
        DevUtilArray.arraysPull(array9);
        DevUtilArray.arraysShow(array9);
        System.out.println("Столбец " + columnMaxSum(array9, sumColumn(array9)) + " имет наибольшую сумму чисел = "
                + sumColumn(array9));
    }
}
