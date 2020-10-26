package decomposition;

/*
13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
Для решения задачи использовать декомпозицию.
 */

import java.util.Scanner;

public class NumThirteenD {

    static int num;

    static int numberInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число больше чем 2");
        if (sc.hasNextInt()) {
            num = sc.nextInt();
            if (num <= 2) {
                System.out.println("Введите число больше чем 2");
                numberInput();
            }
        } else {
            System.out.println("Введите число больше чем 2, или вы ввели число больше чем 2147483647");
            numberInput();
        }
        return num;
    }

    static void cycles(int number) {
        int temporaryChange = number; // переменая в которой мы будем хратить число, для дальнейших действий в цикле
        for (int i = number; i < 2 * number; i += 2) {
            System.out.println(temporaryChange + " и " + (2 + temporaryChange) + " - \"близнецы\"");
            temporaryChange = 2 + temporaryChange;
        }
    }

    public static void main(String[] args) {
        numberInput(); //вводим число
        cycles(num); //выводим все числа блезнецы в промежутке [n, 2 * n]

    }
}
