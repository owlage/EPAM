package oneDimensionalArrays;

//1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

import java.util.Scanner;

public class NumOneO {

    private static int k;

    static void number() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число кратность которого нужно найти не равное нуль");
        boolean bool = true;
        while (bool)
            if (sc.hasNextInt()) {
                k = sc.nextInt();
                bool = false;
                if( k == 0){
                    System.out.println("Не нуль!");
                    number();
                }
            } else {
                System.out.println("Введите целое число!");
                number();
            }
    }

    static void multiplicity(int[] a) {
        int sum = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] % k == 0) {
                sum += a[i];
            }
        }
        System.out.print("Сумма = " + sum);
    }

    public static void main(String[] args) {
        DevUtil.arrLength();
        number();
        int[] arrays = new int[DevUtil.n];
        DevUtil.arrayPull(arrays);
        multiplicity(arrays);
    }
}
