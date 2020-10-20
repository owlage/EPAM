package arraysOfArrays;

//2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class NumTwoA {

    static void diagonal(int[][] a) {
        int x = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j || j == x) {
                    if (a[i][j] < 10) {
                        System.out.print(a[i][j] + "  ");
                    } else {
                        System.out.print(a[i][j] + " ");
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
        NumFourA.newArrayCubeLength();
        int[][] array2 = new int[DevUtilArray.n][DevUtilArray.n];
        DevUtilArray.arraysPull(array2);
        DevUtilArray.arraysShow(array2);
        diagonal(array2);
    }
}
