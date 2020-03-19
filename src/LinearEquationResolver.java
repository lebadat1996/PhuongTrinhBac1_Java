import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        double a, b, x;
        Scanner number = new Scanner(System.in);
        System.out.print("nhap a: ");
        a = number.nextDouble();
        System.out.print("nhap b: ");
        b = number.nextDouble();
        if (a == 0) {
            System.out.println("phuong trinh vo nghiem");
        }else if (a!=0){
            x = -b/a;
            System.out.println("Nghiem cua PT: " + x);
        }
    }
}
