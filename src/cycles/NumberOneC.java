package cycles;
/*
1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа
 от 1 до введенного пользователем числа.
 */

import java.util.Scanner;

public class NumberOneC {

    public static void number() {
        Scanner sc = new Scanner(System.in);
        int z,b = 0;
        try {
            System.out.println("Введите целое число");
            int a = sc.nextInt();
            for(z = 0; z <= a; z++){
                b += z ;
            }
            System.out.println(b);
        } catch (Exception e) {
            System.out.println("Не допустимое значение");
            System.out.println("Попробуй ещё");
            number();
        }
    }

    public static void main(String[] args) {

        number();

    }
}
