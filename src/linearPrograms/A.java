package linearPrograms;

public class A {

    static int algorithmNod(int a, int b) {
        int d = 0;
        while (b != 0 && a != 0) {
            if (a > b) {
                a %= b;
                System.out.println("a"+a);
            } else {
                b %= a;
                System.out.println("b"+b);
            }
            d = a + b;
            System.out.println("d"+d);
        }
        return d;
    }


    public static void main(String[] args) {
        algorithmNod(9, 12);
    }
}







