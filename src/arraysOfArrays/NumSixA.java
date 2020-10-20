package arraysOfArrays;

//6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class NumSixA {

    static void newArray6(int[][] a) {
        int b = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i <= j && j <= a.length - i || i >= j && j >= a.length - i - 1) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        NumFourA.newArrayCubeLength();
        int[][] array6 = new int[DevUtilArray.n][DevUtilArray.n];
        newArray6(array6);
        DevUtilArray.arraysShow(array6);
    }
}
