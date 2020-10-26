package decomposition;

//3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.

public class NumThreeD {

    // вычесляем площадь равностороннего треугольника
    static double triangleArea(double b) {
        return Math.sqrt(3) / 4 * Math.pow(b, 2);
    }

    //площадь равностороннего треугольника умножаем на 6
    // т.к. правильный шестиугольник состоит из 6 равносторонних треугольников
    static double areaHexagon(double c) {
        return triangleArea(c) * 6;
    }

    public static void main(String[] args) {
        double a;
        System.out.println("Введите длинну стороны шестиугольника");
        a = DevUtilDeco.numberInputDouble();
        System.out.println("Площадь правильного шестиугольника = " + areaHexagon(a));
    }

}
