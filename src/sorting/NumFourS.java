package sorting;

//4. Реализуйте сортировку вставками.

public class NumFourS {

    static void sortByInserts(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            int z = i - 1;
            while (z >= 0 && array[z] > value) {
                array[z + 1] = array[z];
                z--;
            }
            array[z + 1] = value;
        }
    }

    public static void main(String[] args) {
        DevUtilSorting.arrayLength();//ввод длинны массива
        int[] array2 = new int[DevUtilSorting.numberOne];
        DevUtilSorting.arrayPull(array2);//заполнение массива
        DevUtilSorting.arrayShow(array2);//отобразить массив
        sortByInserts(array2);//сортировка
        DevUtilSorting.arrayShow(array2);//отобразить массив
    }
}
