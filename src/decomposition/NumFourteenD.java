package decomposition;

/*
14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
 возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
 Для решения задачи использовать декомпозицию.
 */


import java.util.Scanner;

public class NumFourteenD {

    static long number;

    // вводим и проверяем на правильность ввода число
    static long numberInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        if (sc.hasNextLong()) {
            number = sc.nextLong();
            if (number < 0) {
                System.out.println("Введите число больше чем нуль!");
                numberInput();
            }
        } else {
            numberInput();
        }
        return number;
    }

    // определяем длинну числа, для возведения в степень
    static int numberLength(long number) {
        return (int) Math.log10(number) + 1;
    }

    // поиск числа Армстронга
    static void numArmstrong(long number) {
        System.out.println("числа Армстронга в промежутке " + 1 + " - " + number + " : ");
        for (int i = 1; i <= number; i++) {
            if (divisor(i) == i) { //передаем число в divisor для определения является ли оно числом Армстронга
                System.out.print(i + ", ");
            }
        }
    }

    //каждую цифру числа возводим в степень и суммируем
    static int divisor(long number) {
        int sum = 0;
        int degree = numberLength(number); // длинна переданного числа, для кол - ва циклов и возведения в степень
        long powerNumber; // переменная которая будет хратить передаваемое число, для возведения в степень посл. цифры
        for (int i = 0; i <= degree; i++) {
            powerNumber = number;
            powerNumber %= 10;
            powerNumber = (long) Math.pow(powerNumber, degree);
            sum += powerNumber;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        numberInput();
        numArmstrong(number);
    }
}

//Является ли введенное число, числом Армстронга
/*
public class NumFourteenD {

    static long number;

    static void numberPull() {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLong()) {
            number = sc.nextLong();
            if (number < 0) {
                System.out.println("Введите число больше чем нуль!");
                numberPull();
            }
        } else {
            numberPull();
        }
    }

    static int numberLength(long x) {
        return (int) Math.log10(x) + 1;
    }

    static long numArmstrong(long a) {
        int sum = 0;
        int x = numberLength(a);
        for (int i = 0; i <= x; i++) {
            long z = a;
            z %= 10;
            z = (long) Math.pow(z, x);
            sum += z;
            a /= 10;
        }
        return sum;
    }

    static void numArmstrongFinish(long a) {
        if (number == numArmstrong(a)) {
            System.out.println(number + " является числом Армстронга");
        } else {
            System.out.println(number + " не является числом Армстронга");
        }
    }

    public static void main(String[] args) {
        numberPull();
        numArmstrong(number);
        numArmstrongFinish(number);
    }
}
*/



