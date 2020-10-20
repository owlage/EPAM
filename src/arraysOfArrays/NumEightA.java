package arraysOfArrays;

/*
8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит пользователь
с клавиатуры.
 */

import java.util.Scanner;

public class NumEightA {

    static int x, y;


    static void numberColumns() {
        Scanner sc = new Scanner(System.in);
        boolean bool = true;
        System.out.println("Выберите столбец 1");
        if (sc.hasNextInt()) {
            x = sc.nextInt();
            System.out.println("Выберите столбец 2");
            y = sc.nextInt();
            while (bool) {
                if (x > DevUtilArray.d || x == 0 || y > DevUtilArray.d || y == 0 || x > y || x == y) {
                    numberColumns();
                } else {
                    bool = false;
                }
            }
        } else {
            System.out.println("Введите целое число");
            numberColumns();
        }
    }

    static void swapColumn(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (j == x - 1) {
                    int q = a[i][x - 1];
                    a[i][x - 1] = a[i][y - 1];
                    a[i][y - 1] = q;
                }
            }
        }
    }

    public static void main(String[] args) {
        DevUtilArray.arraysLength();
        int[][] array8 = new int[DevUtilArray.n][DevUtilArray.d];
        DevUtilArray.arraysPull(array8);
        DevUtilArray.arraysShow(array8);
        numberColumns();
        swapColumn(array8);
        DevUtilArray.arraysShow(array8);
    }
}
