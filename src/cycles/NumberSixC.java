package cycles;

//6. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
// m и n вводятся с клавиатуры.

import java.util.Scanner;

public class NumberSixC {

    public static void dividers ( int a, int b){
        for ( int i = a; i <= b; i++ ){
            System.out.print(" У числа " + i + " делители: ");
            for ( int j = 2; j <= i; j++ ){
                if (i != j) {
                    if (i % j == 0) {
                        System.out.print(j + " ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        if(m < n) {
            dividers(m, n);
        }
        if(m > n){
            dividers(n, m);
        }
    }
}
