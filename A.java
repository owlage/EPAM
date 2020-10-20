package linearPrograms;

import java.util.Scanner;

public class A {

    public static void number() {
        int a = 0, b = 0, c = 0;
        double z = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 3 целых числа через enter");
        if (sc.hasNextInt()) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            z = (((double) a - 3) * (double) b / 2) + (double) c;
            System.out.println(z);
        } else {
            System.out.println("Не допустимое значение");
            number();
        }
    }


    public static void main(String[] args) {
    }
}







