package OneDimensionalArrays;

//3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
// положительных и нулевых элементов.

public class NumThreeO {

    static int pos = 0;
    static int nega = 0;
    static int equa = 0;

    static int positive(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                pos++;
            }
        }
        return pos;
    }

    static int negative(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                nega++;
            }
        }
        return nega;
    }

    static int equally(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                equa++;
            }
        }
        return equa;
    }

    static void rand(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 200 - 100);
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        DevUtil.arrLength();
        int[] array3 = new int[DevUtil.n];
        rand(array3);
        System.out.println();
        System.out.println("Положительных чисел = " + positive(array3));
        System.out.println("Отрицательных чисел = " + negative(array3));
        System.out.println("Равно нуль = " + equally(array3));
    }
}
