package OneDimensionalArrays;

//10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент
// (освободившиеся элементы заполнить нулями).

public class NumTenO {

    static int[] a3;

    static void sort(int[] a) {
        int[] a1;
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
        a3 = new int[a1.length];
        for (int i = 0; i < a3.length; i++) {
            a3[i] = a1[i];
        }
    }

    public static void main(String[] args) {
        DevUtil.arrLength();
        int[] array10 = new int[DevUtil.n];
        DevUtil.arrayPull(array10);
        sort(array10);
        DevUtil.output(a3);
    }
}
