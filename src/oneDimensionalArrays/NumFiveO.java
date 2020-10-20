package oneDimensionalArrays;

//5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

public class NumFiveO {

    static void ran(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 200 - 100);
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void input(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > i) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        DevUtil.arrLength();
        int[] array4 = new int[DevUtil.n];
        ran(array4);
        input(array4);


    }
}
