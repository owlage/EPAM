package arraysOfArrays;
/*
7. Сформировать квадратную матрицу порядка N по правилу:
и подсчитать количество положительных элементов в ней.
 */

public class NumSevenA {

    static int matrixForm(double[][] a) {
        int sum = 0;
        for (int i = 1; i < a.length - 1; i++) {
            for (int j = 1; j < a[i].length - 1; j++) {
                a[i][j] = Math.sin((i * i - j * j) / DevUtilArray.n);
                if(a[i][j] > 0.0){
                    sum++;
                }
            }
        }
        return sum;
    }

    static void showDoubleArray(double[][] d) {
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NumFourA.newArrayCubeLength();
        double[][] array7 = new double[DevUtilArray.n][DevUtilArray.n];
        System.out.println("Кло-во положительных элементов: " + matrixForm(array7));
        showDoubleArray(array7);


    }
}
