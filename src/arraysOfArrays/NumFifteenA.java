package arraysOfArrays;

//15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class NumFifteenA {

    static int max;

    static void maxDefine(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a[i].length; k++) {
                    if (a[j][k] > max) {
                        max = a[j][k];
                    }
                }
            }
        }
        System.out.println("Максимальное число в массиве = " + max);
    }

    static void maxInsteadNotEven(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] % 2 != 0) {
                    a[i][j] = max;
                }
            }
        }
    }


    public static void main(String[] args) {
        DevUtilArray.arraysLength();
        int[][] array15 = new int[DevUtilArray.n][DevUtilArray.d];
        DevUtilArray.arraysPull(array15);
        DevUtilArray.arraysShow(array15);
        maxDefine(array15);
        maxInsteadNotEven(array15);
        DevUtilArray.arraysShow(array15);
    }
}
