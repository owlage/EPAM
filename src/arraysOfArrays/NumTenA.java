package arraysOfArrays;

/*
10. Найти положительные элементы главной диагонали квадратной матрицы.
 */

public class NumTenA {

    static void minusArraysPull(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100 - 50);
            }
        }
    }

    //отображение массива, переписал т.к. работаем с отрицательными числами, вывод ровной матрицы
    static void arraysShowTen(int[][] array) {
        System.out.println("Массив:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] >= 0) {
                    if (array[i][j] < 10) {
                        System.out.print("  " + array[i][j] + "  ");
                    } else {
                        System.out.print(" " + array[i][j] + "  ");
                    }
                }
                if (array[i][j] < 0) {
                    if (array[i][j] > -10) {
                        System.out.print(" " + array[i][j] + "  ");
                    } else {
                        System.out.print(array[i][j] + "  ");
                    }
                }
            }
            System.out.println();
        }
    }

    //положительные элементы главной диагонали
    static void diagonalArraysPlus(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] >= 0 && i == j) {
                    if (array[i][j] < 10) {
                        System.out.print("  " + array[i][j] + "  ");
                    } else {
                        System.out.print(" " + array[i][j] + "  ");
                    }
                }
                if (array[i][j] >= 0 && i != j) {
                    System.out.print("     ");
                }
                if (array[i][j] < 0) {
                    System.out.print("     ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        DevUtilArray.arrayCube();
        int[][] array10 = new int[DevUtilArray.line][DevUtilArray.line];
        minusArraysPull(array10);//заполняем матрицу рандом числами от -50 до 50
        arraysShowTen(array10);//вывод массива на экран
        System.out.println("положительные элементы главной диагонали:");
        diagonalArraysPlus(array10);
    }
}
