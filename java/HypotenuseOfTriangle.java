import java.util.Scanner;

public class HypotenuseOfTriangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double a;
            double b;
            double c;
            
            System.out.print("enter the value of a : ");
            a = sc.nextDouble();
            System.out.print("enter the value of b : ");
            b = sc.nextDouble();
            c = Math.sqrt(Math.pow(a , 2) + Math.pow(b , 2));
            
            System.out.println("Hypotenues of triangle is " + c);
            sc.close();
        }
    }
}
