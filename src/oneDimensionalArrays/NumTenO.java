package oneDimensionalArrays;

//10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент
// (освободившиеся элементы заполнить нулями).

public class NumTenO {

    static int[] array1;
    static int[] array2;

    static void sort(int[] arr) {
        //узнаем длинну и создаем новый массив
        if (arr.length % 2 == 0) {
            array1 = new int[arr.length / 2];
        } else {
            array1 = new int[arr.length / 2 + 1];
        }
        //заполняем новый массив пропуская каждый второй элемент из заданного массива
        int j = 0;
        for (int i = 0; i <= array1.length - 1; i++) {
            array1[i] = arr[j];
            j += 2;
        }
        //свободные элементы заполняем нулями
        array2 = new int[arr.length];
        for (int i = 0; i < array2.length; i += 2) {
            array2[i] = arr[i];
        }
    }

    public static void main(String[] args) {
        DevUtil.numberInput();
        int[] array10 = new int[DevUtil.number];
        DevUtil.arrayFillIn(array10);
        sort(array10);
        System.out.println("Массив без каждого воторого элемента первоначального массива: ");
        DevUtil.arrayShow(array1);
        System.out.println("Новый массив:");
        DevUtil.arrayShow(array2);
    }
}
