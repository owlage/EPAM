package cycles;

//2. Вычислить значения функции на отрезке [а,b] c шагом h:

import java.util.Scanner;

public class NumberTwoC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        double y;

        for (double i = a; i <= b; i += h) {
            if (i > 2) {
                y = i;
            } else {
                y = i * (-1);
            }
            System.out.println("При х = " + i + " у = " + y);
        }
        System.out.println();
    }
}






