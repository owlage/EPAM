package decomposition;

//4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие,
// между какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.

import java.util.Scanner;

public class NumFourD {

    static double number;
    static double x1, x2, y1, y2, x3, x4, y3, y4; //координаты точочек
    static char ch = 65; //вывод точек A; B; C и т.д.
    static char dot1, dot2, dot3, dot4;

    //вычисление расстояния между точками
    static double distanceBetweenPoint(double x1, double x2, double y1, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    static double numberInputDouble() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        if (sc.hasNextDouble()) {
            number = sc.nextDouble();
        } else {
            System.out.println("Введите число");
            numberInputDouble();
        }
        return number;
    }

    //ввод координат точек
    static void pointEntry() {
        System.out.println("Введите координаты точки " + ch);
        dot1 = ch++;
        x1 = numberInputDouble();
        y1 = numberInputDouble();
        System.out.println("Ввудите коордитаты точки " + ch);
        dot2 = ch++;
        x2 = numberInputDouble();
        y2 = numberInputDouble();
        System.out.println("Ввудите коордитаты точки " + ch);
        dot3 = ch++;
        x3 = numberInputDouble();
        y3 = numberInputDouble();
        System.out.println("Ввудите коордитаты точки " + ch);
        dot4 = ch++;
        x4 = numberInputDouble();
        y4 = numberInputDouble();

    }


    public static void main(String[] args) {
        System.out.println("Введите координаты точек через enter" + ", коордиты [0, 0] - выход из программы");
            pointEntry();
            double[] arr = {x1, y1, x2, y2, x3, y3, x4, y4};
            double firstPair = distanceBetweenPoint(x1, x2, y1, y2);//сохранение расстояния между первой парой
            double twoPair = distanceBetweenPoint(x3, x4, y3, y4);//сохранение расстояния между второй парой
            System.out.println("Растояние между точками " + dot1 + " и " + dot2 + " = " + firstPair);
            System.out.println("Растояние между точками " + dot3 + " и " + dot4 + " = " + twoPair);
            if (firstPair < twoPair) {
                System.out.println("Растояние между точками " + dot1 + " и " + dot2 +
                        " меньше чем растояние между точками " + dot3 + " и " + dot4);
                System.out.print("Массив координат = ");
                for (double array : arr) {
                    System.out.print(array + " ");
                }
                System.out.println();
            } else if (firstPair == twoPair) {
                System.out.println("Растояние между точками " + dot1 + " и " + dot2 + ", " +
                        dot3 + " и " + dot4 + " будет равно");
                System.out.print("Массив координат = ");
                for (double array : arr) {
                    System.out.print(array + " ");
                }
                System.out.println();
            } else {
                System.out.println("Растояние между точками " + dot1 + " и " + dot2 +
                        " больше чем растояние между точками " + dot3 + " и " + dot4);
                System.out.print("Массив координат = ");
                for (double array : arr) {
                    System.out.print(array + " ");
                }
                System.out.println();
            }
    }
}
