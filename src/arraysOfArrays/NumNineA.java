package arraysOfArrays;
/*
9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец содержит
максимальную сумму.
 */

public class NumNineA {

    static int sumColumn(int[][] a) {
        int sumMax1 = 0;
        int sumMax2 = 0;
        int z = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length; j++) {
                sumMax1 += a[j][i];
            }
            if (sumMax2 < sumMax1) {
                sumMax2 = sumMax1;
            }
            sumMax1 = 0;
        }
        return sumMax2;
    }

    public static void main(String[] args) {
        DevUtilArray.arraysLength();
        int[][] array9 = new int[DevUtilArray.n][DevUtilArray.d];
        DevUtilArray.arraysPull(array9);
        DevUtilArray.arraysShow(array9);
        System.out.println(sumColumn(array9));
    }
}
