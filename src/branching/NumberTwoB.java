package branching;

//2. Найти max{min(a, b), min(c, d)}.

import java.util.Scanner;

public class NumberTwoB {

    static double a, b, c, d;

    static void fourNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 4 числа через enter");
        if (sc.hasNextDouble()) {
            a = sc.nextDouble();
            if (sc.hasNextDouble()) {
                b = sc.nextDouble();
                if (sc.hasNextDouble()) {
                    c = sc.nextDouble();
                    if (sc.hasNextDouble()) {
                        d = sc.nextDouble();
                    } else {
                        System.out.println("Введите число");
                        fourNumbers();
                    }
                } else {
                    System.out.println("Введите число");
                    fourNumbers();
                }
            } else {
                System.out.println("Введите число");
                fourNumbers();
            }
        } else {
            System.out.println("Введите число");
            fourNumbers();
        }
    }


    public static void main(String[] args) {
        fourNumbers();
        double x = Math.max(Math.min(a, b), Math.min(c, d));
        System.out.println(x);
    }
}
