package arraysOfArrays;

/*
8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит пользователь
с клавиатуры.
 */

import java.util.Scanner;

public class NumEightA {

    static int numOneColumn, numTwoColumn;


    static void numberColumns() {
        Scanner sc = new Scanner(System.in);
        boolean bool = true;
        System.out.println("Выберите столбец 1");
        if (sc.hasNextInt()) {
            numOneColumn = sc.nextInt();
            System.out.println("Выберите столбец 2");
            numTwoColumn = sc.nextInt();
            //проверка на ввод столбцов
            while (bool) {
                if (numOneColumn > DevUtilArray.column || numOneColumn == 0 || numOneColumn > DevUtilArray.column
                        || numTwoColumn == 0 || numOneColumn > numTwoColumn || numOneColumn == numTwoColumn) {
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

    //смена столбцов местами
    static void swapColumn(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == numOneColumn - 1) {
                    int q = array[i][numOneColumn - 1];
                    array[i][numOneColumn - 1] = array[i][numTwoColumn - 1];
                    array[i][numTwoColumn - 1] = q;
                }
            }
        }
    }

    public static void main(String[] args) {
        DevUtilArray.arraysLength();
        int[][] array8 = new int[DevUtilArray.line][DevUtilArray.column];
        DevUtilArray.arraysPull(array8);
        DevUtilArray.arraysShow(array8);
        numberColumns();//выбираем столбцы
        swapColumn(array8);//меняем их местами
        DevUtilArray.arraysShow(array8);
    }
}
