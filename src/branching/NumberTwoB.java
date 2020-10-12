package branching;

import java.util.Scanner;

public class NumberTwoB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 4 числа");
        double a, b, c, d;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = sc.nextDouble();
        double x = Math.max(Math.min(a, b), Math.min(c, d));
        System.out.println(c);
    }
}
