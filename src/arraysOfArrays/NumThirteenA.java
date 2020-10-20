package arraysOfArrays;

//13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

public class NumThirteenA {

    //Сортировка столбиков в матрице
/*
    static void sortArraysColumn(int[][] a) {
        System.out.println("По возрастанию");
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                for (int k = 0; k < a[i].length; k++) {
                    if (a[j - 1][k] >= a[j][k]) {
                        int q = a[j - 1][k];
                        a[j - 1][k] = a[j][k];
                        a[j][k] = q;
                    }
                }
            }
        }
        DevUtilArray.arraysShow(a);
        System.out.println("По убыванию");
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                for (int k = 0; k < a[i].length; k++) {
                    if (a[j - 1][k] <= a[j][k]) {
                        int q = a[j - 1][k];
                        a[j - 1][k] = a[j][k];
                        a[j][k] = q;
                    }
                }
            }
        }
        DevUtilArray.arraysShow(a);
    }
*/
    //Сортировка матрицы по столбикам
    static void sortAllArraysColumn(int[][] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i].length; k++) {
                    for (int l = 0; l < a.length; l++) {
                        if (a[i][j] >= a[l][k]) {
                            int q = a[i][j];
                            a[i][j] = a[l][k];
                            a[l][k] = q;
                        }
                    }
                }
            }
        }
        DevUtilArray.arraysShow(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i].length; k++) {
                    for (int l = 0; l < a.length; l++) {
                        if (a[i][j] <= a[l][k]) {
                            int q = a[i][j];
                            a[i][j] = a[l][k];
                            a[l][k] = q;
                        }
                    }
                }
            }
        }
        DevUtilArray.arraysShow(a);
    }

    public static void main(String[] args) {
        DevUtilArray.arraysLength();
        int[][] array13 = new int[DevUtilArray.n][DevUtilArray.d];
        DevUtilArray.arraysPull(array13);
        DevUtilArray.arraysShow(array13);
        System.out.println();
        //sortArraysColumn(array13); //Сортировка столбиков в матрице
        sortAllArraysColumn(array13);

    }
}
