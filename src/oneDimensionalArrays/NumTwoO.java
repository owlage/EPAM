package oneDimensionalArrays;

//2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z,
// этим числом. Подсчитать количество замен.

public class NumTwoO {

    private static int numberOfOperations = 0;

    //считаем кол-во замен
    static void sumMethod(int[] array, int z) {
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] > z) {
                array[i] = z;
                numberOfOperations++;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Кол-во операций = " + numberOfOperations);
    }


    public static void main(String[] args) {
        DevUtil.numberInput(); // вводим длинну массива
        int[] array1 = new int[DevUtil.number];
        int numberMultiplicity = DevUtil.numberForOperations();
        DevUtil.arrayFillIn(array1);
        sumMethod(array1, numberMultiplicity);

    }


}
