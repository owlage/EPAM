package branching;

//6. Вычислить значение функции:

public class NumberFiveB {

    public static void main(String[] args) {
        System.out.println("Введите значение х");
        double a;
        double x = NumberFourB.brick();
        if(x <= 3){
            a = x * x - 3 * x + 9;
        }
        else {
            a = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.println(a);
    }
}
