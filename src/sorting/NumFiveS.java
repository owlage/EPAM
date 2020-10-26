package sorting;

//5. Реализуйте сортировку Шелла.

public class NumFiveS {

    static void sortShella(int[] array) {
        int i, j, step;
        int tmp;
        for (step = DevUtilSorting.numberOne / 2; step > 0; step /= 2)
            for (i = step; i < DevUtilSorting.numberOne; i++) {
                tmp = array[i];
                for (j = i; j >= step; j -= step) {
                    if (tmp < array[j - step])
                        array[j] = array[j - step];
                    else
                        break;
                }
                array[j] = tmp;
            }
    }

    public static void main(String[] args) {
        DevUtilSorting.arrayLength();//ввод размера массива
        int[] array5 = new int[DevUtilSorting.numberOne];
        DevUtilSorting.arrayPull(array5);//заполнение массива
        DevUtilSorting.arrayShow(array5);//отобразить массив
        sortShella(array5);//сортировка Шелла
        DevUtilSorting.arrayShow(array5);//отобразить отсортированный массив
    }
}
