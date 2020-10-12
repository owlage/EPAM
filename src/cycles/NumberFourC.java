package cycles;

//4. Составить программу нахождения произведения квадратов первых двухсот чисел.

import java.math.BigInteger;

public class NumberFourC {

    public static void main(String[] args) {
/*
        double composition = 1;
        int count = 0;
        double number = -5.0;

        while (count <= 200) {
            composition = composition * number * number;
            number += 0.01;
            count++;
        }

        System.out.println("Произведение квадратов чисел равно " + composition);
        System.out.println();
    }
}*/

        BigInteger multiply1 = new BigInteger("1");
        BigInteger sum = new BigInteger("1");
        int a;

        for(int i = 1; i <=200; i++){
            a = i;
           BigInteger num =  BigInteger.valueOf(a);
            multiply1 = num.multiply(num);
            sum = sum.multiply(multiply1);
            i++;
        }
        System.out.println(sum);


    }
}