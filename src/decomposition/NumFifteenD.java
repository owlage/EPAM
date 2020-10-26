package decomposition;

/*
15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
(например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */

import java.util.Scanner;

public class NumFifteenD {


    static long number;

    // ввод и проверка целого числа
    static long numberInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        if (sc.hasNextLong()) {
            number = sc.nextLong();
            if (4 > numberLength(number)) {
                System.out.println("Ведите более 4 цифр!");
                numberInput();
            }
        } else {
            numberInput();
        }
        return number;
    }

    // определяем длинну переданного числа
    static int numberLength(long number) {
        return (int) Math.log10(number) + 1;
    }

    //определение последней цифры в числе
    static int extremeNumber() {
        int x = numberLength(number);
        long numberForOperations = 0;
        for (int i = 0; i <= x; i++) {
            numberForOperations = number;
            numberForOperations %= 10;
            number /= 10;
            return (int) numberForOperations;
        }
        return (int) numberForOperations;
    }

    //заполнение массива
    static void fillingTheArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = extremeNumber(); //определение послдней цифры числа и запись в массив
        }
    }

    //поиск последовательности из 4 - х чисел в массиве
    static void checkForOrderOfNumbers(int[] arr) {
        for (int i = 0; i < arr.length - 3; i++) {
            if (arr[i] < arr[i + 1] && arr[i + 1] < arr[i + 2] && arr[i + 2] < arr[i + 3]) {
                System.out.println("Числа образующие возрастающую последовательность " + arr[i] + "" + arr[i + 1] +
                        "" + arr[i + 2] + "" + arr[i + 3]);
            } else {
                System.out.println("Нет цифр образующие возрастающую последовательность.");
            }
        }
    }

    public static void main(String[] args) {
        numberInput();
        int[] array = new int[numberLength(number)];
        fillingTheArray(array);
        checkForOrderOfNumbers(array);

    }
}
