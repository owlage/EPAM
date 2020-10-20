package sorting;

//2. Реализуйте сортировку выбором.

public class NumTwoS {

    public static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int pos = i;
            int min = a[i];
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < min) {
                    pos = j;
                    min = a[j];
                }
            }
            a[pos] = a[i];
            a[i] = min;
        }
    }

    public static void main(String[] args) {
        DevUtilSorting.arrayLength();
        int [] array2 = new int[DevUtilSorting.a];
        DevUtilSorting.arrayPull(array2);
        DevUtilSorting.arrayShow(array2);
        sort(array2);
        DevUtilSorting.arrayShow(array2);
    }
}
