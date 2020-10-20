package arraysOfArrays;

/*14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
причем в каждом столбце число единиц равно номеру столбца.
 */

public class NumFourteenA {

    static void zeroAndOne(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j) {
                    for (int k = j; k < a[i].length; k++) {
                        a[i][k] = 1;
                        System.out.print(a[i][k] + " ");
                    }
                    j = a[i].length; // если убрать строку?
                } else {
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DevUtilArray.arraysLength();
        int[][] array10 = new int[DevUtilArray.n][DevUtilArray.d];
        zeroAndOne(array10);
    }
}
