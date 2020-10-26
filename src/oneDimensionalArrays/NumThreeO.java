package oneDimensionalArrays;

//3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
// положительных и нулевых элементов.

public class NumThreeO {

    static int positive = 0;
    static int negative = 0;
    static int zeroElement = 0;

    //поиск положительных элементов
    static int positive(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                positive++;
            }
        }
        return positive;
    }

    //поиск отрицательных элементов
    static int negative(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                negative++;
            }
        }
        return negative;
    }

    //поиск равных нуль элементов
    static int equally(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                zeroElement++;
            }
        }
        return zeroElement;
    }

    //заполнение массива числами [-100, 100]
    static void random(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200 - 100);
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        DevUtil.numberInput();
        int[] array3 = new int[DevUtil.number];
        random(array3);
        System.out.println();
        System.out.println("Положительных чисел = " + positive(array3));
        System.out.println("Отрицательных чисел = " + negative(array3));
        System.out.println("Равных нуль = " + equally(array3));
    }
}
