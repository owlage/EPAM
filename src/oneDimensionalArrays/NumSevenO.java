package oneDimensionalArrays;

//7. Даны действительные числа а1 ,а2 ,..., аn. Найти

public class NumSevenO {

    public static void main(String[] args) {
        DevUtil.arrLength();
        int array10[] = new int[DevUtil.n];
        DevUtil.arrayPull(array10);
        int max = 0;
        for (int i = 0, j = array10.length - 1; i < j; i++, j--) {
            if (max < array10[i] + array10[j - i]) {
                max = array10[i] + array10[j - i];
            }
        }
        System.out.println(max);
    }
}
