package oneDimensionalArrays;

//4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

public class NumFourO {

    private static int maxNum = 1; // = 1 что бы началось сравнение чисел, т.к. массив заполняется с 1
    private static int minNum;

    //поиск максимального и минимального числа в массиве
    static void maxAndMin(int[] a) {
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] <= maxNum) {
                maxNum = a[i];
            }
            if (a[i] >= minNum) {
                minNum = a[i];
            }
        }
    }

    //смена места минимального и максимального элемента
    static void swap(int[] b) {
        for (int i = 0, j = b.length - 1; i <= b.length / 2; i++, j--) {
            if (b[i] == maxNum && b[j] == minNum) {
                int f = b[i];
                b[i] = b[j];
                b[j] = f;
            }
        }
    }

    public static void main(String[] args) {
        DevUtil.numberInput();
        int[] array2 = new int[DevUtil.number];
        DevUtil.arrayFillIn(array2); // заполняем массив
        maxAndMin(array2);
        System.out.println("Новый массив:");
        swap(array2);
        DevUtil.arrayShow(array2);
    }
}

