package sorting;

//5. Реализуйте сортировку Шелла.

public class NumFiveS {

    static void sortShella(int[]a){
            int i, j, step;
            int tmp;
            for (step = DevUtilSorting.a / 2; step > 0; step /= 2)
                for (i = step; i < DevUtilSorting.a; i++)
                {
                    tmp = a[i];
                    for (j = i; j >= step; j -= step)
                    {
                        if (tmp < a[j - step])
                            a[j] = a[j - step];
                        else
                            break;
                    }
                    a[j] = tmp;
                }
        }

    public static void main(String[] args) {
        DevUtilSorting.arrayLength();
        int [] array5 = new int[DevUtilSorting.a];
        DevUtilSorting.arrayPull(array5);
        DevUtilSorting.arrayShow(array5);
        sortShella(array5);
        DevUtilSorting.arrayShow(array5);
    }
}
