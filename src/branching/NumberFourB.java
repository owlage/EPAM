package branching;

/*4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
Определить, пройдет ли кирпич через отверстие.
 */

import java.util.Scanner;

public class NumberFourB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bool = true;
        while (bool) {
            System.out.println("Введите разверы отверстия");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            System.out.println("Введите размеры кирпича");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double z = sc.nextDouble();
            if (a != 0 & b != 0) {
                if (x != 0 & y != 0 & z != 0) {
                    if (a >= x && b >= y || a >= y && b >= x || a >= x && b >= z || a >= z && b >= x ||
                            a >= y && b >= z || a >= z && b >= y) {
                        System.out.println("Кирпичь пройдет");
                    } else {
                        System.out.println("Кирпичь не пройдет");
                    }
                    bool = false;
                } else {
                    System.out.println("Это не кирпичь");
                    continue;
                }
            } else {
                System.out.println("Это не отверстие");
                continue;
            }
        }
    }

}

