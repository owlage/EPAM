package cycles;

//5. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class NumberFiveC {

    public static void main(String[] args) {

        for( int i = 32; i <= 126; i++){
            System.out.println(i + " = " + (char) i);
        }
    }
}
