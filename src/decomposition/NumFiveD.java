package decomposition;

/*5. Составить программу, которая в массиве A[N] находит второе по величине число
(вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).
 */

public class NumFiveD {

    static int lessMore(int[] a) {
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (max1 < a[i]) {
                max2 = max1;
                max1 = a[i];
            }
            if (a[i] < max1 && a[i] > max2) {
                max2 = a[i];
            }
        }
        return max2;
    }

    public static void main(String[] args) {
        System.out.println("Введите длинну массива");
        DevUtilDeco.numberInput();
        int[] arr = new int[DevUtilDeco.num];
        DevUtilDeco.arrayFillIn(arr); // заполняем массив рандомными числами 1 - 20
        DevUtilDeco.arrayShow(arr); // выводим массив на экран
        System.out.println();
        System.out.println("Число меньше максимального элемента массива = " + lessMore(arr));
    }
}
