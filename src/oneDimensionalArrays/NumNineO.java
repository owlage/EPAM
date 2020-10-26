package oneDimensionalArrays;

//9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
// Если таких чисел несколько, то определить наименьшее из них.

public class NumNineO {

    static void rand20(int[] a) {
        System.out.println("Массив:");
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 20 + 1);
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }


    static int getNumber(int[] array) {
        int[] arrayCoincidences = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int z = 0;
            //проходим по массиву в поиске кол-ва совпадений и сохраняем данные в новый массив
            for (int k : array) {
                if (array[i] == k) {
                    arrayCoincidences[i] = z++;
                }
            }
        }
        int numberOfMatches = arrayCoincidences[0];
        int moreCommon = array[0];
        for (int i = 0; i < arrayCoincidences.length; i++) {
            if (arrayCoincidences[i] > numberOfMatches) {  //проверка на кол-во совпадений
                numberOfMatches = arrayCoincidences[i];
                moreCommon = array[i];
            }
            if (arrayCoincidences[i] == numberOfMatches && array[i] < moreCommon) { // нахождение минимального числа
                moreCommon = array[i];
            }
        }
        return moreCommon;
    }

    public static void main(String[] args) {
        DevUtil.numberInput();
        int[] array9 = new int[DevUtil.number];
        rand20(array9);
        System.out.println("Минимальное из самых встречаемых числе: " + getNumber(array9));
    }
}
