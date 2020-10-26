package decomposition;

import java.util.Scanner;

/*
16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */

/*
При вводе 9-ти и больше значных чисел программа долго считает, нужно подождать. Пытался сделать что бы выполнялось
быстрее но не получилось сократить время, и не смог показать что идет посчёт суммы(я предположил что это делается с
помощью потоков, с потоками очень слабо знаком), в связи с эти попросил ввод числа не больше чем 999 999 999
при вводе больших чисел придется подождать несколько секунд.
 */
public class NumSixteenD {

    static int number;

    // ввод числа и проверка на правильность ввода
    static int numberInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число не меньше чем 1 и не больше чем 999_999_999");
        if (sc.hasNextInt()) {
            number = sc.nextInt();
            if (number < 1) {
                System.out.println("Ведите число больше чем нуль");
                numberInput();
            }
            if (number > 999999999) {
                System.out.println("Введите меньшее число");
                numberInput();
            }
        } else {
            numberInput();
        }
        return number;
    }

    // длинна числа для дальнейших циклов
    static int lengthOfNumber(int number) {
        int count = (number == 0) ? 1 : 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    //определение кол-во чётных цифр в сумме
    static int numberOfEven(long number) {
        int even = 0;
        int numberForOperations;
        int x = lengthOfNumber((int) number); // в 'х' храним длинну передаваемого числа
        for (int i = 1; i <= x; i++) {
            numberForOperations = (int) number;
            numberForOperations %= 10;
            number /= 10;
            if (numberForOperations % 2 == 0) {
                even++;
            }
        }
        return even;
    }

    // определение суммы
    static long sumOfNumbers(int number) {
        long sum = 0;
        for (int i = 1; i <= number; i++) {
            if (evenOrOdd(i)) { //является ли число нечётным
                sum += i;
            }
        }
        return sum;
    }

    //проверка на нечётную цифру
    static boolean evenOrOdd(int number) {
        boolean bool = true;
        int numberForOperations;
        int x = lengthOfNumber(number); //в х храним длинну передеваемого числа
        for (int i = 1; i <= x; i++) {
            numberForOperations = number;
            numberForOperations %= 10;
            number /= 10;
            if (numberForOperations % 2 == 0) {
                bool = false;
            }
        }
        return bool;
    }


    public static void main(String[] args) {
        int number = numberInput();
        System.out.println("Идет подсчёт...");
        System.out.println("Сумма чисел, содержащих только нечетные цифры от " + 1 + " до " + number + " = " +
                sumOfNumbers(number));
        System.out.println("Кол - во четных цифр в сумме = " + numberOfEven(sumOfNumbers(number)));

    }
}

