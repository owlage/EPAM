package oneDimensionalArrays;

//8. Дана последовательность целых чисел а1 ,а2 ,..., аn. Образовать новую последовательность,
// выбросив из исходной те члены, которые равны min(а1 ,а2 ,..., аn).

public class NumEightO {
    /* создание нового массива из 2 минимальных элементов первого массива

    static void newArray(int []a){
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    static void minArray(int[]a, int []b){
        int c = 0;
        for (int i = 0; i < b.length - 1; i += 2) {
            a[c++] = Math.min(b[i], b[i + 1]);
        }
    }

    public static void main(String[] args) {
        DevUtil.numberInput();
        int[] array8 = new int[DevUtil.n];
        NumSixO.rand(array8);
        int[] array85 = new int[array8.length / 2];
        minArray(array85, array8);
        System.out.println();
        newArray(array85);
    }
}

     */

    // нахождение минимального числа в масиве и занесение его в новый

    static void random(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50 + 1);
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //поиск минимального элемента массива
    static int minNumber(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    //сколько элементов в массиве равных минимальному элементу, создать новый массив array8.length - min * кол-во равных
    static int woundedMin(int[] array) {
        int counter = 0; // счётчик
        int min = minNumber(array); // минимальный элемент массива
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                counter++;
            }
        }
        return counter;
    }

    //создаем новый массив из старого не содержашего равных мин элементу
    static void fillInNewArray(int[] arrayFull, int[] newArray, int min) {
        int j = 0;
        for (int i = 0; i < arrayFull.length; i++) {
            if (arrayFull[i] != min) {
                newArray[j++] = arrayFull[i];
            }
        }
    }

    public static void main(String[] args) {
        DevUtil.numberInput();
        int[] array8 = new int[DevUtil.number];
        System.out.println("Массив:");
        random(array8);
        int[] arrayNew = new int[array8.length - woundedMin(array8)];
        fillInNewArray(array8, arrayNew, minNumber(array8));
        System.out.println("Новый массив без минимального элемента: ");
        DevUtil.arrayShow(arrayNew);

    }
}


