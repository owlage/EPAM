package linearPrograms;

//1. Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c.

import java.util.Scanner;

public class NumberOne {
    public static void number() {
        Scanner sc = new Scanner(System.in);
        double z;
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            z = (((double) a - 3) * (double) b / 2) + (double) c;
            System.out.println(z);
        } catch (Exception e) {
            System.out.println("Не допустимое значение");
            System.out.println("Попробуй ещё");
            number();
        }

    }

    public static void main(String[] args){

        number();

    }
}

