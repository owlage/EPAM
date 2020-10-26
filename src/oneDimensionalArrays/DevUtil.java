package oneDimensionalArrays;

import java.util.Scanner;

class DevUtil {

    static int number, numberForOperations;

    //ввод числа для далнейших операций
    static int numberForOperations() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        if (sc.hasNextInt()) {
            numberForOperations = sc.nextInt();
            if (numberForOperations <= 0) {
                System.out.println("Введите целое не отрицательное число!");
                numberForOperations();
            }
        } else {
            System.out.println("Введите целое не отрицательное число!");
            numberForOperations();
        }
        return numberForOperations;
    }


    // ввод и проверка целого числа для заполнения массива
    static void numberInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длинну массива: не отрицательное и не равное нуль!");
        if (sc.hasNextInt()) {
            number = sc.nextInt();
            if (number <= 0) {
                System.out.println("Введите не отрицательное и не равное нуль число!");
                numberInput();
            }
        } else {
            System.out.println("Введите целое число!");
            numberInput();
        }
    }

    //заполнение массива
    static void arrayFillIn(int[] array) {
        System.out.println("Массив:");
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //отображение массива
    static void arrayShow(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
