package cycles;

//3. Найти сумму квадратов первых ста чисел.

public class NumberThreeC {

    public static void main(String[] args) {

        int sum = 0;
        for(int i = 1; i <= 100; i++){

            sum = (int) (Math.pow( i, 2 ) + sum);

        }
        System.out.println(sum);
    }
}
