package arraysOfArrays;

//2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class NumTwoA {

    static void diagonal(int[][] array) {
        int x = array.length - 1; // последний елемент строки, в "х" для убобства
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || j == x) {
                    if (array[i][j] < 10) {
                        System.out.print(array[i][j] + "  ");
                    } else {
                        System.out.print(array[i][j] + " ");
                    }
                } else {
                    System.out.print("   ");
                }

            }
            x--;
            System.out.println();

        }
    }


    public static void main(String[] args) {
        DevUtilArray.arrayCube();
        int[][] array2 = new int[DevUtilArray.line][DevUtilArray.line];
        DevUtilArray.arraysPull(array2);
        DevUtilArray.arraysShow(array2);
        diagonal(array2);
    }
}
