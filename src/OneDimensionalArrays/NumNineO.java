package OneDimensionalArrays;

//9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
// Если таких чисел несколько, то определить наименьшее из них.

public class NumNineO{

    static void rand20(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 20 + 1);
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }


    static int getNumber(int[] a) {
        int[] arr = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            int z = 0;
            for (int k : a) {
                if (a[i] == k) {
                    arr[i] = z++;
                }
            }
        }
        int numberArr = arr[0];
        int minNumber = a[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > numberArr) {  //проверка на кол-во совпадений
                numberArr = arr[i];
                minNumber = a[i];
                System.out.print(minNumber + " ");
            }
            if (arr[i] == numberArr && a[i] < minNumber) { // нахождение минимального числа
                minNumber = a[i];
            }
        }
        return minNumber;
    }

    public static void main(String[] args) {
        DevUtil.arrLength();
        int[] array9 = new int[DevUtil.n];
        rand20(array9);
        System.out.println(getNumber(array9));
    }
}
