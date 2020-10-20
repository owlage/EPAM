package oneDimensionalArrays;

//2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z,
// этим числом. Подсчитать количество замен.

import java.util.Scanner;

public class NumTwoO {

    private static int sum = 0;

    public static void summ(int[] a, int z) {
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] > z) {
                a[i] = z;
                sum++;
            }
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Кол-во операций = " + sum);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DevUtil.arrLength();
        int[] array1 = new int[DevUtil.n];
        System.out.println("Введите число");
        int z = 0;
        boolean bool = true;
        while (bool){
            if(sc.hasNextInt()){
                z = sc.nextInt();
                bool = false;
            } else {
                System.out.println("Введите целое не отрицательное число!");
            }
        }
        DevUtil.arrayPull(array1);
        summ(array1, z);

    }


}
