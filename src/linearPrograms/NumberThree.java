package linearPrograms;
/*
3.Вычислить значение выражения по формуле (все переменные принимают действительные значения):
infinuty - при одинаковых числа
 */

import java.util.Scanner;

public class NumberThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double z;
        boolean bool = true;
        while (bool) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.cos(y)) * Math.tan(x * y);
            if (Double.isInfinite(z)) { // если два одинаковых числа, возврат к оператору while()
                continue;
            } else {
                bool = false;
                System.out.println(z);
            }
        }


    }
}


