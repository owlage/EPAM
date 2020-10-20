package arraysOfArrays;

//4.Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

import java.util.Scanner;

public class NumFourA {

    static void newArrayCubeLength() {
        System.out.println("Введите число для создания массива:");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            DevUtilArray.n = sc.nextInt();
            if (DevUtilArray.n % 2 != 0) {
                newArrayCubeLength();
                if (DevUtilArray.n < 2) {
                    newArrayCubeLength();
                }
            }
        } else {
            System.out.println("Введите число");
            newArrayCubeLength();
        }
    }

    static void newArrayCube(int[][] a) {
        int k = 1;
        int y = DevUtilArray.n;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = k;
                    k++;
                }
                k = 1;
            } else {
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = y;
                    y--;
                }
                y = DevUtilArray.n;
            }
        }
    }


    static void arraysShow(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] argv) {

        newArrayCubeLength();
        int[][] array4 = new int[DevUtilArray.n][DevUtilArray.n];
        newArrayCube(array4);
        arraysShow(array4);


    }

}

