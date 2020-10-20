package linearPrograms;

//2.Вычислить значение выражения по формуле (все переменные принимают действительные значения):

import java.util.Scanner;

public class NumberTwo {

    static double a, b, c;

    public static void number() {
        double z = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 3 числа через enter");
        if (sc.hasNextDouble()) {
            a = sc.nextDouble();
            if (sc.hasNextDouble()) {
                b = sc.nextDouble();
                if (sc.hasNextDouble()) {
                    c = sc.nextDouble();
                } else {
                    System.out.println("Не допустимое значение");
                    number();
                }
            } else {
                System.out.println("Не допустимое значение");
                number();
            }
        } else {
            System.out.println("Не допустимое значение");
            number();
        }
    }

    static double ratio (double a, double b, double c){
        return ((b + Math.sqrt(Math.pow(b, 2)) + 4 * a * c) / 2) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }

    public static void main(String[] args) {
        number();
        System.out.println("Итог: " + ratio(a,b,c));
    }
}
