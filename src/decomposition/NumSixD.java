package decomposition;

//6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

public class NumSixD {

    static void methodMutuallySimple(int a, int b, int c) {
        if (DevUtilDeco.algorithmNod(DevUtilDeco.algorithmNod(a, b), c) == 1) {
            System.out.println("Все числа взаимо просты");
        } else {
            System.out.println("Числа не взаимно просты, общий делитель: " + DevUtilDeco.algorithmNod
                    (DevUtilDeco.algorithmNod(a, b), c));
        }
    }

    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Первое число");
        a = DevUtilDeco.numberInput();
        System.out.println("Второе число");
        b = DevUtilDeco.numberInput();
        System.out.println("Третье число");
        c = DevUtilDeco.numberInput();
        methodMutuallySimple(a, b, c);
    }
}
