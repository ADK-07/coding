import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int length;
            int breadth;
            int Area;
            
            System.out.println("Enter the length :");
            length = sc.nextInt();
            System.out.println("Enter the breadth:");
            breadth = sc.nextInt();
            
            Area = length * breadth;
            System.out.println("the area is " + Area);
        }

    }
}