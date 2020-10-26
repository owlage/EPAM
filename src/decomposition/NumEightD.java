package decomposition;

/*
8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива
с номерами от k до m.
 */

public class NumEightD {
    /* сделал с созданием выбора куска массива!
        static int k, m;

        static void numbersCountdown(int a[]){
            System.out.println("Для начала отсчета");
            k = DevUtilDeco.number();
            if(k > a.length){
                System.out.println("Вы превысили массив");
                numbersCountdown(a);
            }
            System.out.println("До конца осчёта");
            m = DevUtilDeco.number();
            if(m < k || m > a.length){
                System.out.println("Вы превысили массив или конец отсчета меньше начала");
                numbersCountdown(a);
            }
        }
    */
    static void sumElements(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i < a.length - 2) { // -2 т.к. я прибавлял [a + 1] и [a + 2]
                int arraySum;
                arraySum = a[i] + a[i + 1] + a[i + 2];
                System.out.println("Сумма елементов массива: " + "а[" + i + "] " + "a[" + (i + 1) + "] " + "a[" +
                        (i + 2) + "] " + "= " + arraySum);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Создать массив");
        DevUtilDeco.numberInput();
        int arr[] = new int[DevUtilDeco.num];
        DevUtilDeco.arrayFillIn(arr);
        DevUtilDeco.arrayShow(arr);
        System.out.println();
        //numbersCountdown(arr); //выбор части массива
        sumElements(arr);
    }
}
