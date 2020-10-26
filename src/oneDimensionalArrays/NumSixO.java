package oneDimensionalArrays;

//6. Задана последовательность N вещественных чисел. Вычислить сумму чисел,
// порядковые номера которых являются простыми числами.

public class NumSixO {

    static void random(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50 + 1);
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static int summa(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 2; j <= array[i] / 2; j++) {
                if (array[i] % j == 0) {
                    break;
                } else if (j == array[i] / 2) {
                    sum += array[i];
                }
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        DevUtil.numberInput();
        int[] array6 = new int[DevUtil.number];
        random(array6);
        System.out.println();
        System.out.println("Сумма простых чисел = " + summa(array6));
    }
}

