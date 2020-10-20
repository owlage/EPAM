package sorting;

import java.util.Scanner;

public class DevUtilSorting {

    static int a,b;

    static int arrayLength(){
        System.out.println("Введите длинну массива");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
            a = sc.nextInt();
            if(a < 2){
                System.out.println("Введите число больше чем 2");
                arrayLength();
            }
        } else {
            System.out.println("Введите целое число");
            arrayLength();
        }
        return a;
    }

    static void naturalNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        if(sc.hasNextInt()) {
            b = sc.nextInt();
            if(b < 1){
                System.out.println("Введите число больше чем 1");
                arrayLength();
            }
        } else {
            System.out.println("Введите целое число");
            arrayLength();
        }
    }

    static void arrayPull(int []z){
        for (int i = 0; i < z.length; i++) {
            z[i] = (int) (Math.random() * 20);
        }
    }

    static void arrayShow(int []z){
        System.out.println("Массив");
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i] + " ");
        }
        System.out.println();
    }

}
