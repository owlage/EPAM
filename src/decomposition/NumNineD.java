package decomposition;

/*
9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
если угол между сторонами длиной X и Y— прямой.
 */

public class NumNineD {
    //теорема Пифагора
    static double pifagor(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }

    //площадь треугольника, теорема Герона
    static double quadrangleArea(double hypotenuse, double x, double y) {
        double p = (hypotenuse + x + y) / 2;
        return Math.sqrt(p * (p - hypotenuse) * (p - x) * (p - y));
    }

    public static void main(String[] args) {
        double x, y, z, t;
        System.out.println("Введите 4 стороны четерехугольника, через enter");
        System.out.println("Введите сторону x");
        x = DevUtilDeco.numberInputDouble();
        System.out.println("Введите сторону y");
        y = DevUtilDeco.numberInputDouble();
        System.out.println("Введите сторону z");
        z = DevUtilDeco.numberInputDouble();
        System.out.println("Введите сторону t");
        t = DevUtilDeco.numberInputDouble();
        double rightTriangle1 = quadrangleArea(pifagor(x, y), x, y);//находим площадь прямоугольного треугольника
        double rightTriangle2 = quadrangleArea(pifagor(x, y), z, t);//находим площадь второго треугольника
        double quadrangle = 0;
        /*
        проверка на NAN, если NAN, то второго треугольника не существует т.к. сумма 2 - х сторон меньше диагонали
         */
        if (!Double.isNaN(rightTriangle2)) {
            quadrangle = rightTriangle1 + rightTriangle2;
        } else {
            System.out.println("Такого четерех угольника не существует");
        }
        System.out.println("Площадь четерехугольника = " + quadrangle);
    }
}
