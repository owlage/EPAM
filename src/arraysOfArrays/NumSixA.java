package arraysOfArrays;

//6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class NumSixA {

    static void newArray6(int[][] array) {
        int b = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i <= j && j <= array.length - i || i >= j && j >= array.length - i - 1) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        NumFourA.newArrayCubeLength();
        int[][] array6 = new int[DevUtilArray.line][DevUtilArray.line];
        newArray6(array6);
        DevUtilArray.arraysShow(array6);
    }
}
