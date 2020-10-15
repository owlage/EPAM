package OneDimensionalArrays;

//6. Задана последовательность N вещественных чисел. Вычислить сумму чисел,
// порядковые номера которых являются простыми числами.

public class NumSixO {

    static void rand(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 50 + 1);
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static int summa(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 2; j <= a[i] / 2; j++) {
                if (a[i] % j == 0) {
                    break;
                } else if (j == a[i] / 2) {
                    sum += a[i];
                }
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        DevUtil.arrLength();
        int[] array6 = new int[DevUtil.n];
        rand(array6);
        System.out.println();
        System.out.println("Сумма простых чисел = " + summa(array6));
    }
}

