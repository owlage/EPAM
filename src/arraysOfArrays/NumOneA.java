package arraysOfArrays;

//1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class NumOneA {

    static void column(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j % 2 != 0) { //поиск нечетных столбцов
                    if (array[0][j] > array[array.length - 1][j]) {//сравнение 1-го и последнего числа в столбце
                        if (array[i][j] < 10) { // для красоты вывода, вместо цифр ставим пробел
                            System.out.print(array[i][j] + "  ");
                        } else {
                            System.out.print(array[i][j] + " ");
                        }
                    } else {
                        System.out.print("   ");
                    }
                }
                if (j % 2 == 0) {
                    System.out.print("   ");
                }
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        DevUtilArray.arraysLength();
        int[][] arrays = new int[DevUtilArray.line][DevUtilArray.column];
        DevUtilArray.arraysPull(arrays);
        DevUtilArray.arraysShow(arrays);
        System.out.println("Все нечетные столбцы, у которых первый элемент больше последнего.");
        column(arrays);
    }
}
