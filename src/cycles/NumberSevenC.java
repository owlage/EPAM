package cycles;

//7. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

import java.util.ArrayList;
import java.util.Scanner;

public class NumberSevenC {

    static int num;
    static int a;
    static int b;

    static void number() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 целых числа через enter");
        if (sc.hasNextInt()) {
            a = sc.nextInt();
            if (sc.hasNextInt()) {
                b = sc.nextInt();
                //num = (int) Math.log10(a) + 1;
                //num = (int) Math.log10(b) + 1;
            } else {
                System.out.println("Введите целые числа!");
                number();
            }
        } else {
            System.out.println("Введите целые числа!");
            number();
        }
    }


    public static void numberEnter(int a, int b) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        int i = 0;
        while (a > 0) {
            array.add(i, a % 10);
            a /= 10;
            i++;
        }
        int j = 0;
        while (b > 0) {
            array2.add(j, b % 10);
            b /= 10;
            j++;
        }
        for (int x = array.size() - 1; x >= 0; x--) {
            for (int y = array2.size() - 1; y >= 0; y--) {
                if (array.get(x) == array2.get(y)) {
                    System.out.print(array.get(x) + ";");
                    array.remove(x);
                    array2.remove(y);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {

        number();
        numberEnter(a, b);
    }
}
