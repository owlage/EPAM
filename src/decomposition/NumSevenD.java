package decomposition;

//7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class NumSevenD {

    static void factorial() {
        for (int i = 1; i <= 9; i += 2) {
            int z = 1;
            for (int j = 1; j <= i; j++) {
                z *= j;
            }
            System.out.println("Факториал числа " + i + " = " + z);
        }
    }

    public static void main(String[] args) {
        factorial();
    }
}
