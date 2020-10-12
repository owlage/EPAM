package branching;

//3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

import java.util.Scanner;

public class NumberThreeB {

    static double x1, y1, x2, y2, x3, y3;

    static void scan(double a, double b){
        System.out.println("Введите координаты точки");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
    }

    public static void main(String[] args) {

        scan(x1, y1);
        scan(x2, y2);
        scan(x3, y3);

        if ((x1 - x3) / (x2 - x3) == (y1 - y3) / (y2 - y3)){
            System.out.println("Точки находятся на одной прямой");
        }
        else {
            System.out.println("Точки не лежат на одной прямой");
        }
    }
}