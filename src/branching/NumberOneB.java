package branching;

/*1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
и если да, то будет ли он прямоугольным.
 */

import java.util.Scanner;

public class NumberOneB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 угла");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if(a + b <= 180){
            System.out.println("Треугольник существует");
            if(a == 90 && b == 90 && (a + b) == 90){
                System.out.println("Треугольник прямоугольный");
            }
        }else {
            System.out.println("Треугольника не существует");
        }
    }
}
