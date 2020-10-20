package arraysOfArrays;

//5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class NumFiveA {

    static void arrays5Matrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length - i; j++) {
                a[i][j] = i + 1;
            }
        }
    }


    public static void main(String[] args) {

        NumFourA.newArrayCubeLength();
        int array5[][] = new int[DevUtilArray.n][DevUtilArray.n];
        arrays5Matrix(array5);
        DevUtilArray.arraysShow(array5);

    }
}
