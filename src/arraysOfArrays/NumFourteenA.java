package arraysOfArrays;

/*14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
причем в каждом столбце число единиц равно номеру столбца.
 */

public class NumFourteenA {

    static void zeroAndOne(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) { //находим диагональ матрицы и от нее запоняем строку "1"
                    for (int k = j; k < array[i].length; k++) {
                        array[i][k] = 1;
                        System.out.print(array[i][k] + " ");
                    }
                    // если убрать строку,идет переполнение массива, не совсем понимаю почему так происходит
                    //но эта строка решает проблему, не помню как дошел до этого
                    j = array[i].length;
                } else {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DevUtilArray.arraysLength();
        int[][] array10 = new int[DevUtilArray.line][DevUtilArray.column];
        zeroAndOne(array10);
    }
}
