package OneDimensionalArrays;

import java.util.Scanner;

public class DevUtil {

    public static int n;
    static Scanner sc = new Scanner(System.in);

    static void arrLength() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длинну массива:");
        try {
            n = sc.nextInt();
        } catch (Exception e) {
            arrLength();
        }
    }

    static void arrayPull(int[] a) {
        System.out.println("Массив:");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = i + 1;
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void output (int []a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }


}
