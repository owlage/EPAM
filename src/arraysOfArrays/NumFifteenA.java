package arraysOfArrays;

//15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class NumFifteenA {

    static int max;

    //поиск макс числа в матрице
    static void maxDefine(int[][] array) {
        for (int j = 0; j < array.length; j++) {
            for (int k = 0; k < array[j].length; k++) {
                if (array[j][k] > max) {//
                    max = array[j][k];
                }
            }
        }
        System.out.println("Максимальное число в массиве = " + max);
    }

    //проверка на нечетное число
    static void maxInsteadNotEven(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 != 0) {//если елемент массива нечет, меняем его на макс
                    array[i][j] = max;
                }
            }
        }
    }


    public static void main(String[] args) {
        DevUtilArray.arraysLength();//определяем размер матрицы
        int[][] array15 = new int[DevUtilArray.line][DevUtilArray.column];
        DevUtilArray.arraysPull(array15);//заполняем матрицу
        DevUtilArray.arraysShow(array15);//отобразить матрицу
        maxDefine(array15);//поиск макс числа в матрице
        maxInsteadNotEven(array15);//свап нечет чисел на макс число
        DevUtilArray.arraysShow(array15);
    }
}
