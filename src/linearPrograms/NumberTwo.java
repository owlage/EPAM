package linearPrograms;

//2.Вычислить значение выражения по формуле (все переменные принимают действительные значения):

import java.util.Scanner;

public class NumberTwo {

    public static double ratio (double a, double b, double c){
        double z;
        return z = ((b + Math.sqrt(Math.pow(b, 2)) + 4 * a * c) / 2) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, z;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        z = ratio(a, b, c);
        System.out.println(z);


    }
}
