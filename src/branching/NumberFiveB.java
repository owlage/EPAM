package branching;

//6. Вычислить значение функции:

import java.util.Scanner;

public class NumberFiveB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение х");
        double a;
        double x = sc.nextDouble();
        if(x <= 3){
            a = x * x - 3 * x + 9;
        }
        else {
            a = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.println(a);
    }
}
