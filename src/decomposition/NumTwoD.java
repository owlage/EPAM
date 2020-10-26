package decomposition;

//2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class NumTwoD {
    public static void main(String[] args) {
        int a, b, c, d;
        System.out.println("Первое число");
        a = DevUtilDeco.numberInput();
        System.out.println("Второе число");
        b = DevUtilDeco.numberInput();
        System.out.println("Третье число");
        c = DevUtilDeco.numberInput();
        System.out.println("Четвертое число");
        d = DevUtilDeco.numberInput();
        //вызываем методы НОД и НОК из класса DevUtil и передаем им четыре введеных числа
        System.out.printf("Наибольший общий делите чисел %d и %d и %d и %d = %d%n", a, b, c, d,
                DevUtilDeco.algorithmNod(DevUtilDeco.algorithmNod(DevUtilDeco.algorithmNod(a, b), c), d));
    }
}
