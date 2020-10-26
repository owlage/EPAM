package oneDimensionalArrays;

//7. Даны действительные числа а1 ,а2 ,..., аn. Найти

public class NumSevenO {

    static void random(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 50 + 1);
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DevUtil.numberInput();
        int[] array10 = new int[DevUtil.number];
        random(array10);
        int max = array10[0] + array10[array10.length - 1];
        for (int i = 1; i < array10.length / 2; i++) {
            if ((array10[i] + array10[array10.length - i - 1]) > max) {
                max = array10[i] + array10[array10.length - i - 1];
            }
        }
        System.out.println(max);
    }
}
