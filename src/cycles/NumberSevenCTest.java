package cycles;

import java.util.Scanner;

public class NumberSevenCTest {

    static int num;
    static int a;
    static int f;
    static int[] array = new int[10];

    static void Number() {
        try {
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            if (a < 0) {
                a *= -1;
            }
            num = (int) Math.log10(a) + 1;
        } catch (Exception e) {
            System.out.println("Вы ввели не целое число");
            Number();
        }
    }

    public static  void NumberOne() {
        int i = 0;
        f = num;
        while (num > 0) {
            array[i] = a % 10;
            a = a / 10;
            num--;
            i++;
        }
        Array();
    }

    public static void Array(){
        for(int i = f-1; i >= 0; i--){
            System.out.print(array[i]+";");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {

        Number();
        NumberOne();
        Number();
        NumberOne();
    }
}
