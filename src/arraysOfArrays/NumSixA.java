package arraysOfArrays;

//6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

import java.util.Scanner;

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

    static void newArrayCubeLength() {
        System.out.println("Введите число для создания массива:");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            DevUtilArray.line = sc.nextInt();
            if (DevUtilArray.line % 2 != 0) { //проверка на n - чётное
                newArrayCubeLength();
                if (DevUtilArray.line < 2) {
                    newArrayCubeLength();
                }
            }
        } else {
            System.out.println("Введите число");
            newArrayCubeLength();
        }
    }

    public static void main(String[] args) {
        newArrayCubeLength();
        int[][] array6 = new int[DevUtilArray.line][DevUtilArray.line];
        newArray6(array6);
        DevUtilArray.arraysShow(array6);
    }
}
