package cycles;
/*
1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа
 от 1 до введенного пользователем числа.
 */

import java.util.Scanner;

public class NumberOneC {

    public static void number() {
        Scanner sc = new Scanner(System.in);
        int z, b = 0;
        System.out.println("Введите целое число");
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            if (a >= 1) {
                for (z = 1; z <= a; z++) {
                    b += z;
                }
                System.out.println("Сумма всех чисел от 1 до " + a + " = " + b);
            } else {
                System.out.println("Введите положительное число!");
                number();
            }
        } else {
            System.out.println("Не допустимое значение");
            System.out.println("Попробуй ещё");
            number();
        }
    }

    public static void main(String[] args) {

        number();

    }
}
