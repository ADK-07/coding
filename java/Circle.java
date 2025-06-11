import java.util.Scanner;

public class Circle {
   public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)) {
        //area = Math.PI * Math.pow(radius , 2)
        //circumfrance = 2 * Math.PI * radius
        //volume = (4/3) * Math.PI * Math.pow(radius , 3)

        int radius;
        double area;
        double circumfrance;
        double volume;

        System.out.print("\n Enter the radius of circle :");
        radius = sc.nextInt();

        area = Math.PI * Math.pow(radius, 2);
        circumfrance = 2 * Math.PI * radius;
        volume = ( 4 / 3 ) * Math.PI * Math.pow(radius, 3);
        /*System.out.println("Area of circle is : " +area );
        System.out.println("circumfrance of circle is : " + circumfrance);
        System.out.println("volume of circle is : " + volume);*/

        System.out.printf("\nArea of circle is : %.2fcm²\n", area);
        System.out.printf("circumfrance of circle is : %.2fcm\n", circumfrance);
        System.out.printf("Area of circle is : %.2fcm³\n", volume);
        

        sc.close();
    }
   } 
}
