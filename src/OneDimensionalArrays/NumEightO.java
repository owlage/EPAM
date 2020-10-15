package OneDimensionalArrays;

//8. Дана последовательность целых чисел а1 ,а2 ,..., аn. Образовать новую последовательность,
// выбросив из исходной те члены, которые равны min(а1 ,а2 ,..., аn).

public class NumEightO {
    /* создание нового массива из 2 минимальных элементов первого массива

    static void newArray(int []a){
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    static void minArray(int[]a, int []b){
        int c = 0;
        for (int i = 0; i < b.length - 1; i += 2) {
            a[c++] = Math.min(b[i], b[i + 1]);
        }
    }

    public static void main(String[] args) {
        DevUtil.arrLength();
        int[] array8 = new int[DevUtil.n];
        NumSixO.rand(array8);
        int[] array85 = new int[array8.length / 2];
        minArray(array85, array8);
        System.out.println();
        newArray(array85);
    }
}

     */

    // нахождение минимального числа в масиве и занесение его в новый
    public static void main(String[] args) {
        DevUtil.arrLength();
        int[] array8 = new int[DevUtil.n];
        NumSixO.rand(array8);
        int[] array85 = new int[1];
        int min = array8[0];
        for (int i = 0; i < array8.length; i++) {
            if (min > array8[i]) {
                min = array8[i];
            }
        }
        array85[0] = min;
        System.out.println(array85[0]);

    }
}


