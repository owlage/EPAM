package arraysOfArrays;

//5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class NumFiveA {

    static void arrays5Matrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - i; j++) {
                array[i][j] = i + 1;
            }
        }
    }


    public static void main(String[] args) {

        DevUtilArray.arrayCube();//ввод размера матрицы
        int array5[][] = new int[DevUtilArray.line][DevUtilArray.line];
        arrays5Matrix(array5);
        DevUtilArray.arraysShow(array5);

    }
}
