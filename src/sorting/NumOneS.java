package sorting;

/*1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в один массив,
включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя дополнительный массив.
 */

public class NumOneS {

    public static void main(String[] args) {
        System.out.println("Задайте длинну 1 - го массива");
        DevUtilSorting.numberOne = DevUtilSorting.arrayLength();
        int[] arr1 = new int[DevUtilSorting.numberOne];
        System.out.println("Задайте длинну 2 - го массива");
        DevUtilSorting.numberOne = DevUtilSorting.arrayLength();
        int[] arr2 = new int[DevUtilSorting.numberOne];
        DevUtilSorting.naturalNumber();
        DevUtilSorting.arrayPull(arr1);
        if (DevUtilSorting.numberTwo > arr1.length) {
            System.out.println("Вы ввели число превышающее массив");
            DevUtilSorting.naturalNumber();
        }
        System.out.print("1 ");
        DevUtilSorting.arrayShow(arr1);
        DevUtilSorting.arrayPull(arr2);
        System.out.print("2 ");
        DevUtilSorting.arrayShow(arr2);
        int[] sum = new int[arr1.length + arr2.length];
        int e = 0;
        System.out.print("Новый ");
        for (int i = 0; i < sum.length; i++) {
            if (i < DevUtilSorting.numberTwo) {
                sum[i] = arr1[e];
                e++;
            }
            if (i == DevUtilSorting.numberTwo) {
                for (int j = 0; j < arr2.length; j++) {
                    sum[i++] = arr2[j];
                }
            }
            if (i > DevUtilSorting.numberTwo) {
                sum[i] = arr1[e];
                e++;
            }
        }
        DevUtilSorting.arrayShow(sum);
    }
}
