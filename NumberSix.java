package linearPrograms;
/*
6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
        принадлежит закрашенной области, и false — в противном случае:
*/
import java.util.Scanner;

public class NumberSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (x > -5.0 & x <-3.0 || x < 5.0 & x > 2.0) {
            if (y <= 0.0 && y > -4.0) {
                System.out.println("true");
            } else
                System.out.println("false");
                }
        else if(x >= -2.0 & x <= 2.0){
            if(y >= -3.0 & y < 5.0){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        }
        else {
            System.out.println("false");
            }
        }
    }



