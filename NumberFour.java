package linearPrograms;
/*
4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами дробную и
 целую части числа и вывести полученное значение числа.
 */

import java.util.Scanner;

public class NumberFour {

    static double d;

    public static double Number (double d){
        d = (d * 1000) % 1000 + (int) d / 1000.0;
        return d;
    }

    static void numer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дробное число, через запятую");
        if(sc.hasNextDouble()){
            d = sc.nextDouble();

        } else {
            System.out.println("Не допустимый символ.");
            numer();
        }
    }

    public static void main(String[] args) {
        numer();
        System.out.println(d);
        System.out.println(Number(d));
    }
}
