package arraysOfArrays;

/*11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк,
в которых число 5 встречается три и более раз.
 */

public class NumElevenA {

    static void arraysEleven10X20(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            int x = 0;
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 15);
                if(a[i][j] < 10) {
                    System.out.print(" " + a[i][j] + " ");
                    if(a[i][j] == 5){
                        x++;
                    }
                } else {
                    System.out.print(a[i][j] + " ");
                }
            }
            if(x == 3){
                System.out.println("Срока " + (i + 1) + " содержит" + " число 5, больше трех");
            } else {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int [][]arrays11 = new int[10][20];
        arraysEleven10X20(arrays11);
    }
}
