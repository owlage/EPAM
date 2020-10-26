package decomposition;

/*
17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких действий надо
 произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию
 */

import java.util.Scanner;

public class NumSeventeenD {

    static int numberOfOperations;

    //ввод числа и проверка на ошибки
    static long numberInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        long number = 0;
        if (sc.hasNextLong()) {
            number = sc.nextLong();
            if (number < 1) {
                System.out.println("Ведите число больше чем нуль");
                numberInput();
            }
        } else {
            numberInput();
        }
        return number;
    }

    //определение длинны числа, для обозначения конца цикла
    static int numberLength(long number) {
        return (int) Math.log10(number) + 1;
    }

    //счётчик операций
    static int divisor(long number) {
        long sum = calculationOfTheAmount(number);
        boolean bool = true;
        while (bool) {
            if (number > 0) {
                numberOfOperations++;
            }
            if (number == 0) {
                bool = false;
            }
            number -= sum;
            sum = calculationOfTheAmount(number);
        }
        return numberOfOperations;
    }

    //нахождение суммы цифр числа
    static int calculationOfTheAmount(long number) {
        int x = numberLength(number);
        long numberForOperations;
        ;
        long sum = 0;
        for (int i = 0; i <= x; i++) {
            numberForOperations = number;
            numberForOperations %= 10;
            number /= 10;
            sum += numberForOperations;
        }
        return (int) sum;
    }

    public static void main(String[] args) {
        long number = numberInput();
        System.out.println("Неоходимо операций " + divisor(number));
    }
}


