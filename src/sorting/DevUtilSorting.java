package sorting;

import java.util.Scanner;

public class DevUtilSorting {

    static int numberOne, numberTwo;

    //проверка ввода
    static int arrayLength() {
        System.out.println("Введите длинну массива");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            numberOne = sc.nextInt();
            if (numberOne < 2) {
                System.out.println("Введите число больше чем 2");
                arrayLength();
            }
        } else {
            System.out.println("Введите целое число");
            arrayLength();
        }
        return numberOne;
    }

    //проверка ввода
    static void naturalNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        if (sc.hasNextInt()) {
            numberTwo = sc.nextInt();
            if (numberTwo < 1) {
                System.out.println("Введите число больше чем 1");
                arrayLength();
            }
        } else {
            System.out.println("Введите целое число");
            arrayLength();
        }
    }

    //заполнение массива
    static void arrayPull(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
        }
    }

    //отобразить массив
    static void arrayShow(int[] array) {
        System.out.println("Массив");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
