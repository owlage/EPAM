package oneDimensionalArrays;

//1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

import java.util.Scanner;

public class NumOneO {

    private static int k;

    static void number() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число кратность которого нужно найти не равное нуль");
        boolean bool = true;
        while (bool)
            if (sc.hasNextInt()) {
                k = sc.nextInt();
                bool = false;
                if (k == 0) {
                    System.out.println("Не нуль!");
                    number();
                }
            } else {
                System.out.println("Введите целое число!");
                number();
            }
    }

    //находим числа кратные введеному числу 'k' и определяем их сумму
    static void multiplicity(int[] array) {
        int sum = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] % k == 0) {
                sum += array[i];
            }
        }
        System.out.print("Сумма = " + sum);
    }

    public static void main(String[] args) {
        DevUtil.numberInput();//вводим длинну массива
        number(); //вводим кратное число
        int[] arrays = new int[DevUtil.number]; //number - статическая переменая из класса DevUtil
        DevUtil.arrayFillIn(arrays); // выводим заполненый массив
        multiplicity(arrays);
    }
}
