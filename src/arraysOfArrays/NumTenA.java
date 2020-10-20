package arraysOfArrays;

/*
10. Найти положительные элементы главной диагонали квадратной матрицы.
 */

public class NumTenA {

    static void minusArraysPull(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 100 - 50);
            }
        }
    }

    static void arraysShowTen(int[][] a) {
        System.out.println("Массив:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] >= 0) {
                    if (a[i][j] < 10) {
                        System.out.print("  " + a[i][j] + "  ");
                    } else {
                        System.out.print(" " + a[i][j] + "  ");
                    }
                }
                if (a[i][j] < 0) {
                    if (a[i][j] > -10) {
                        System.out.print(" " + a[i][j] + "  ");
                    } else {
                        System.out.print(a[i][j] + "  ");
                    }
                }
            }
            System.out.println();
        }
    }


    static void diagonalArraysPlus(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] >= 0 && i == j) {
                    if (a[i][j] < 10) {
                        System.out.print("  " + a[i][j] + "  ");
                    } else {
                        System.out.print(" " + a[i][j] + "  ");
                    }
                }
                if (a[i][j] >= 0 && i != j) {
                    System.out.print("     ");
                }
                if (a[i][j] < 0) {
                    System.out.print("     ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        NumFourA.newArrayCubeLength();
        int[][] array10 = new int[DevUtilArray.n][DevUtilArray.n];
        minusArraysPull(array10);
        arraysShowTen(array10);
        System.out.println();
        diagonalArraysPlus(array10);
    }
}
