package OneDimensionalArrays;

//2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z,
// этим числом. Подсчитать количество замен.

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
        DevUtil.arrLength();
        int[] array1 = new int[DevUtil.n];
        System.out.println("Введите число");
        int z = NumOneO.sc.nextInt();
        DevUtil.arrayPull(array1);
        summ(array1, z);

    }


}
