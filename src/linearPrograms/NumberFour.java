package linearPrograms;
/*
4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами дробную и
 целую части числа и вывести полученное значение числа.
 */

import java.util.Scanner;

public class NumberFour {

    public static double Number (double d){
        d = (d * 1000) % 1000 + (int) d / 1000.0;
        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        System.out.println(d);
        System.out.println(Number(d));
    }


}
