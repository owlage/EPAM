package OneDimensionalArrays;

//10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент
// (освободившиеся элементы заполнить нулями).

public class NumTenO {

    static void sort(int[] a) {
        for (int i = 0; i <= a.length - 1; i += 2) {
            a[i] = 0;
        }
    }

    public static void main(String[] args) {
        DevUtil.arrLength();
        int[] array10 = new int[DevUtil.n];
        DevUtil.arrayPull(array10);
        sort(array10);
        DevUtil.output(array10);
    }
}
