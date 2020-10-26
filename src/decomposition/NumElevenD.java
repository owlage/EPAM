package decomposition;

/*
11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */

public class NumElevenD {

    //определяем кол - во цифр в каждом числе
    static void numbersElementsInTwo(int numberOne, int numberTwo) {
        int numberOneLength = (int) Math.log10(numberOne) + 1;
        int numberTwoLength = (int) Math.log10(numberTwo) + 1;
        if (numberOneLength < numberTwoLength) {
            System.out.println("Число " + numberOne + " состоит из " + numberOneLength + " цифр, а число " + numberTwo +
                    " состоит из " + numberTwoLength + " цифр!");
            System.out.println("Число " + numberTwo + " больше числа " + numberOne);
        } else if (numberOneLength == numberTwoLength) {
            System.out.println("Число " + numberOne + " состоит из " + numberOneLength + " цифр, а число " + numberTwo +
                    " состоит из " + numberTwoLength + " цифр!");
            System.out.println("Количество цифр в числах равны! ");
        } else {
            System.out.println("Число " + numberOne + " состоит из " + numberOneLength + " цифр, а число " + numberTwo +
                    " состоит из " + numberTwoLength + " цифр!");
            System.out.println("Число " + numberOne + " больше числа " + numberTwo);
        }
    }

    public static void main(String[] args) {
        System.out.println("Первое число");
        int numberOne = DevUtilDeco.numberInput();
        System.out.println("Второе число");
        int numberTwo = DevUtilDeco.numberInput();
        numbersElementsInTwo(numberOne, numberTwo);
    }
}
