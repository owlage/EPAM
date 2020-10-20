package arraysOfArrays;

//1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class NumOneA {

    static void column(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (j % 2 != 0) {
                    if (a[0][j] > a[a.length - 1][j]) {
                        if (a[i][j] < 10) {
                            System.out.print(a[i][j] + "  ");
                        } else {
                            System.out.print(a[i][j] + " ");
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
        int[][] arrays = new int[DevUtilArray.n][DevUtilArray.d];
        DevUtilArray.arraysPull(arrays);
        DevUtilArray.arraysShow(arrays);
        System.out.println("Все нечетные столбцы, у которых первый элемент больше последнего.");
        column(arrays);
    }
}
