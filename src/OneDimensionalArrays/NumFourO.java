package OneDimensionalArrays;

//4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

public class NumFourO {

    private static int x = 1;
    private static int y;

    static void maxAndMin(int[] a) {
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] <= x) {
                x = a[i];
            }
            if (a[i] >= y) {
                y = a[i];
            }
        }
    }

    static void swap(int[] b) {
        for (int i = 0, j = b.length - 1; i <= b.length / 2; i++, j--) {
            if (b[i] == x && b[j] == y) {
                int f = b[i];
                b[i] = b[j];
                b[j] = f;
            }
        }
    }

    public static void main(String[] args) {
        DevUtil.arrLength();
        int[] array2 = new int[DevUtil.n];
        DevUtil.arrayPull(array2);
        maxAndMin(array2);
        swap(array2);
        DevUtil.output(array2);
    }
}

