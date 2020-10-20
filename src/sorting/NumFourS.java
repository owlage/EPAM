package sorting;

//4. Реализуйте сортировку вставками.

public class NumFourS {

    static void sortByInserts(int []a) {
        for (int i = 1; i < a.length; i++) {
            int value = a[i];
            int z = i - 1;
            while (z >= 0 && a[z] > value) {
                a[z + 1] = a[z];
                z--;
            }
            a[z + 1] = value;
        }
    }
    public static void main(String[] args) {
        DevUtilSorting.arrayLength();
        int [] array2 = new int[DevUtilSorting.a];
        DevUtilSorting.arrayPull(array2);
        DevUtilSorting.arrayShow(array2);
        sortByInserts(array2);
        DevUtilSorting.arrayShow(array2);
    }
}
