package stringAsAnArrayOfChar;

//Замените в строке все вхождения 'word' на 'letter'.

public class NumTwoStringAs {

    public static void main(String[] args) {
        System.out.println("Введите строку");
        String str = UtilString.stringInput();
        System.out.println(str.replace("word", "letter"));
    }
}
