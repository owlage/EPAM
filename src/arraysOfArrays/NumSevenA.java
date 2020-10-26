package arraysOfArrays;
/*
7. Сформировать квадратную матрицу порядка N по правилу:
и подсчитать количество положительных элементов в ней.
 */

public class NumSevenA {

    static int matrixForm(double[][] array) {
        int sum = 0;
        for (int i = 1; i < array.length - 1; i++) {
            for (int j = 1; j < array[i].length - 1; j++) {
                array[i][j] = Math.sin((i * i - j * j) / DevUtilArray.line);
                if (array[i][j] > 0.0) { //подсчёт положительных элементов
                    sum++;
                }
            }
        }
        return sum;
    }

    static void showDoubleArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DevUtilArray.arrayCube();
        double[][] array7 = new double[DevUtilArray.line][DevUtilArray.line];
        System.out.println("Кло-во положительных элементов: " + matrixForm(array7));
        showDoubleArray(array7);


    }
}
