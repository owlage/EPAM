package linearPrograms;

import java.util.Scanner;

public class A {

    public static void number() {
        Scanner sc = new Scanner(System.in);
        double z = 0;
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            z = (((double) a - 3) * (double) b / 2) + (double) c;
            System.out.println(z);
        } catch (Exception e) {
            System.out.println("Не допустимое значение");
            number();
        }

    }

    public static void main(String[] args){

        number();

    }
}


