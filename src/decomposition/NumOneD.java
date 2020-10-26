package decomposition;

/*1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего
 общего кратного двух натуральных чисел:
 */

public class NumOneD {

    public static void main(String[] args) {
        int numberOne, numberTwo;
        System.out.println("Первое число");
        numberOne = DevUtilDeco.numberInput();
        System.out.println("Второе число");
        numberTwo = DevUtilDeco.numberInput();
        System.out.println("Наибольший общий делите чисел " + numberOne + " и " + numberTwo + " = " +
                DevUtilDeco.algorithmNod(numberOne, numberTwo));
        System.out.println("Наименшее общее кратное " + numberOne + " и " + numberTwo + " = " +
                DevUtilDeco.algorithmNok(numberOne, numberTwo));
    }
}
