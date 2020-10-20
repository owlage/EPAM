package sorting;

//3. Реализуйте сортировку обменами.

public class NumThreeS {

    static void bubbleSort(int []a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if(a[j] > a[j + 1]){
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        DevUtilSorting.arrayLength();
        int [] array3 = new int[DevUtilSorting.a];
        DevUtilSorting.arrayPull(array3);
        DevUtilSorting.arrayShow(array3);
        bubbleSort(array3);
        DevUtilSorting.arrayShow(array3);
    }
}
