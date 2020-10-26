package decomposition;

/*
12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого являются числа,
сумма цифр которых равна К и которые не большее N.
 */

public class NumTwelveD {

    // находим сумму цифр введеного числа
    static int numberSum(int number, int numberLength) {
        int sum = 0;
        for (int i = 0; i <= numberLength; i++) {
            int x = number % 10;
            sum += x;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number, numberLength;
        System.out.println("Число из которого составим массив");
        number = DevUtilDeco.numberInput();
        System.out.println("Число N");
        numberLength = DevUtilDeco.numberInput();
        // создаем массив равный кол - ву цифр в сумме
        int[] arr = new int[DevUtilDeco.numberLength(numberSum(number, numberLength))];
        // если сумма не превышает число N, то заполняем массива цирами суммы
        if (numberSum(number, numberLength) < numberLength) {
            DevUtilDeco.arrayFillIn(arr, numberSum(number, numberLength));
            System.out.println("Массив из цифр суммы");
            DevUtilDeco.arrayShowFromTheEnd(arr);
        } else {
            System.out.println("Число N меньше суммы цифр К");
            main(args);
        }

    }
}
