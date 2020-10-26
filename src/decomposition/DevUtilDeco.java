package decomposition;

import java.util.Scanner;

public class DevUtilDeco {

    static int num;
    static double numDouble;

    // ввод и проверка целого числа
    static int numberInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число больше чем нуль");
        if (sc.hasNextInt()) {
            num = sc.nextInt();
            if (num < 1) {
                System.out.println("Введите число больше чем нуль");
                numberInput();
            }
        } else {
            System.out.println("Введите число больше чем нуль, или вы ввели число больше чем 2147483647");
            numberInput();
        }
        return num;
    }

    //ввод и проверка числа с точкой
    static double numberInputDouble() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число больше чем нуль");
        if (sc.hasNextDouble()) {
            numDouble = sc.nextDouble();
            if (numDouble < 1) {
                System.out.println("Введите число больше чем нуль");
                numberInputDouble();
            }
        } else {
            System.out.println("Введите число больше чем нуль");
            numberInputDouble();
        }
        return numDouble;
    }

    //заполняем массив
    static void arrayFillIn(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 20 + 1);
        }
    }

    //заполняем массив цифрами переданого числа
    static void arrayFillIn(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            array[i] = number % 10;
            number /= 10;
        }
    }

    //выводим массив
    static void arrayShow(int[] a) {
        System.out.println("Массив");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    //выводим массив с конца
    static void arrayShowFromTheEnd(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + ", ");
        }
    }

    // определяем длинну переданного числа
    static int numberLength(int number) {
        return (int) Math.log10(number) + 1;
    }

    //поиск наибольшего общего делителя
    static int algorithmNod(int a, int b) {
        int d = 0;
        while (b != 0 && a != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
            d = a + b;
        }
        return d;
    }

    //поиск наименьшего общего кратного
    static int algorithmNok(int a, int b) {
        return a * b / algorithmNod(a, b);
    }
}
