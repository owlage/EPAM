package decomposition;

/*
10. Дано натуральное число N. Написать метод(методы) для формирования массива,
элементами которого являются цифры числа N.
 */

public class NumTenD {

    static void elementsNumbers(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = number % 10;
            number = number / 10;
        }
    }

    public static void main(String[] args) {
        int number = DevUtilDeco.numberInput();
        int numberLength = (int) Math.log10(DevUtilDeco.num) + 1; // определяем длинну числа, для создания массива
        int[] array = new int[numberLength];
        elementsNumbers(array, number);
        System.out.print("Число " + number + " состоит из: ");
        DevUtilDeco.arrayShowFromTheEnd(array);
    }

}

