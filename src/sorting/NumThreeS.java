package sorting;

//3. Реализуйте сортировку обменами.

public class NumThreeS {

    static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {//если 1-й елемент массива больше чем 2-ой то меняем их местами
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        DevUtilSorting.arrayLength();//длинна массива
        int[] array3 = new int[DevUtilSorting.numberOne];
        DevUtilSorting.arrayPull(array3);//заполнение массива
        DevUtilSorting.arrayShow(array3);//отображение
        bubbleSort(array3);//сортировка
        DevUtilSorting.arrayShow(array3);//отображение
    }
}
