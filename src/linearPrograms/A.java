package linearPrograms;

import java.util.Random;

public class A {

    public static void main(String[] args) {
        Random ran = new Random();
        int a, b, c;
        a = ran.nextInt(100);
        b = ran.nextInt(100);
        c = ran.nextInt(100);

        double z =  ( ( (double) a - 3 )  * (double) b / 2 ) + (double) c;

        System.out.println( a + ";" + b + ";" + c );
        System.out.println( z );
    }
}
