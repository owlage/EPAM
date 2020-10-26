package oneDimensionalArrays;

//5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

public class NumFiveO {

    //заполняем массив рандомными числа
    static void random(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20 - 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //если a[i] > i то выводим на эклан
    static void input(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > i) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        DevUtil.numberInput();
        int[] array4 = new int[DevUtil.number];
        System.out.println("Массив:");
        random(array4);
        System.out.println("Числа которые больше номера элемента массива:");
        input(array4);


    }
}
