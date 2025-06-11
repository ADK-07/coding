
import java.util.Scanner;


public class Ticket {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            boolean isStudent;
            boolean isSenior;
            double price;

            System.out.print("Are you a student: ");
            isStudent = sc.nextBoolean();

            System.out.print("Are you a senior (above age of 65) : ");
            isSenior = sc.nextBoolean();

            System.out.print("Enter the price of movie ticket : ");
            price = sc.nextDouble();

            if (isStudent) {
                if (isSenior) {
                    System.out.println("you get a senior discount of 20%");
                    System.out.println("you get a student discount of 10%");
                    price *= .7;
                }
                else {
                    System.out.println("you get a discount of 10%");
                    price *= .9;
                }
            }
            else {
                if (isSenior) {
                    System.out.println("you get a senior discount of 20%");
                    price *= .8;
                }
                else {
                     price *= 1;
                }
            }

            System.out.printf("The price of the ticket is : $%.2f", price);

            sc.close();
        }
    }
}
