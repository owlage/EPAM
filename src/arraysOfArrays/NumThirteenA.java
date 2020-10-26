package arraysOfArrays;

//13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

public class NumThirteenA {

    //Сортировка столбиков в матрице

    static void sortArraysColumn(int[][] array) {
        System.out.println("По возрастанию");
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {//j = 1 т.к. мы будем брать элемент массива j - 1
                for (int k = 0; k < array[i].length; k++) {
                    if (array[j - 1][k] >= array[j][k]) {
                        int q = array[j - 1][k];
                        array[j - 1][k] = array[j][k];
                        array[j][k] = q;
                    }
                }
            }
        }
        DevUtilArray.arraysShow(array);
        System.out.println("По убыванию");
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) { //j = 1 т.к. мы будем брать элемент массива j - 1
                for (int k = 0; k < array[i].length; k++) {
                    if (array[j - 1][k] <= array[j][k]) {
                        int q = array[j - 1][k];
                        array[j - 1][k] = array[j][k];
                        array[j][k] = q;
                    }
                }
            }
        }
        DevUtilArray.arraysShow(array);
    }

    //Сортировка матрицы по столбикам
    /*
    static void sortAllArraysColumn(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i].length; k++) {
                    for (int l = 0; l < array.length; l++) {
                        if (array[i][j] >= array[l][k]) {
                            int q = array[i][j];
                            array[i][j] = array[l][k];
                            array[l][k] = q;
                        }
                    }
                }
            }
        }
        System.out.print("По убыванию ");
        DevUtilArray.arraysShow(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i].length; k++) {
                    for (int l = 0; l < array.length; l++) {
                        if (array[i][j] <= array[l][k]) {
                            int q = array[i][j];
                            array[i][j] = array[l][k];
                            array[l][k] = q;
                        }
                    }
                }
            }
        }
        System.out.print("По возрастанию ");
        DevUtilArray.arraysShow(array);
    }
*/
    public static void main(String[] args) {
        DevUtilArray.arraysLength();
        int[][] array13 = new int[DevUtilArray.line][DevUtilArray.column];
        DevUtilArray.arraysPull(array13);
        DevUtilArray.arraysShow(array13);
        System.out.println();
        sortArraysColumn(array13); //Сортировка столбиков в матрице
        //sortAllArraysColumn(array13); //Сортировка всей матрицы по столбткам

    }
}
