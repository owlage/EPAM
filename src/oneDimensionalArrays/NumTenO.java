package oneDimensionalArrays;

//10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент
// (освободившиеся элементы заполнить нулями).

public class NumTenO {

    static int[] a3;
    static int[] a1;

    static void sort(int[] a) {
        if (a.length % 2 == 0) {
            a1 = new int[a.length / 2];
        } else {
            a1 = new int[a.length / 2 + 1];
        }
        int j = 0;
        for (int i = 0; i <= a1.length - 1; i++) {
            a1[i] = a[j];
            j += 2;
        }
        a3 = new int[a.length];
        for (int i = 0; i < a3.length; i += 2) {
            a3[i] = a[i];
        }
    }

    public static void main(String[] args) {
        DevUtil.arrLength();
        int[] array10 = new int[DevUtil.n];
        DevUtil.arrayPull(array10);
        sort(array10);
        DevUtil.output(a1);
        DevUtil.output(a3);
    }
}
