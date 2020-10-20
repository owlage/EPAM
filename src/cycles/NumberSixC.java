package cycles;

//6. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
// m и n вводятся с клавиатуры.

import java.util.Scanner;

public class NumberSixC {
    static int a, b;

    static void numbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 целых числа через enter");
        if (sc.hasNextInt()) {
            a = sc.nextInt();
            if (sc.hasNextInt()) {
                b = sc.nextInt();
            } else {
                System.out.println("Введите целые числа!");
                numbers();
            }
        } else {
            System.out.println("Введите целые числа!");
            numbers();
        }
    }

    public static void dividers(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.print(" У числа " + i + " делители: ");
            for (int j = 2; j <= i; j++) {
                if (i != j) {
                    if (i % j == 0) {
                        System.out.print(j + " ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        numbers();
        boolean bool = true;
        while (bool) {
            if (a < b) {
                dividers(a, b);
                bool = false;
            }
            if (a > b) {
                System.out.println("Нужно задать промежуток, первое число не может быть больше второго!");
                numbers();
            }
        }
    }
}
