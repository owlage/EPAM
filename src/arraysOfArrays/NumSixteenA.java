package arraysOfArrays;

/*16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ...,
так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой. Построить
такой квадрат.
 */

import java.util.Scanner;

public class NumSixteenA {

    static void magicCube() {
        System.out.println("Введите число для создания массива:");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            DevUtilArray.n = sc.nextInt();
            if (DevUtilArray.n < 2) {
                magicCube();
            }
        } else {
            System.out.println("Введите число");
            magicCube();
        }
    }

    public static void main(String[] args) {
        magicCube();
        int[][] magicSquare = new int[DevUtilArray.n][DevUtilArray.n];
        int number = 1;
        int row = 0;
        int column = DevUtilArray.n / 2;
        int curr_row;
        int curr_col;
        while (number <= DevUtilArray.n * DevUtilArray.n) {
            magicSquare[row][column] = number;
            number++;
            curr_row = row;
            curr_col = column;
            row -= 1;
            column += 1;
            if (row == -1) {
                row = DevUtilArray.n - 1;
            }
            if (column == DevUtilArray.n) {
                column = 0;
            }
            if (magicSquare[row][column] != 0) {
                row = curr_row + 1;
                column = curr_col;
                if (row == -1) {
                    row = DevUtilArray.n - 1;
                }
            }
        }

        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare.length; j++) {
                if (magicSquare[i][j] < 10) {
                    System.out.print(magicSquare[i][j] + "  ");
                } else {
                    System.out.print(magicSquare[i][j] + " ");
                }
            }
            System.out.println();
        }
        DevUtilArray.arraysShow(magicSquare);
    }
}
