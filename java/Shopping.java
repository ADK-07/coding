import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        //Shopping cart
        try(Scanner sc = new Scanner(System.in)) {
            String item;
            double price;
            int quantity;
            char currency = '$';
            double total;

            System.out.print("What item would you like: ");
            item = sc.nextLine();

            System.out.print("What is the price for each ?: ");
            price = sc.nextDouble();

            System.out.print("How many would you like?: ");
            quantity = sc.nextInt();

            System.out.println("\nyou have brought " + quantity + " " + item + "/s ");
            total = quantity * price;

            System.out.print("your total is " + currency + total );
            sc.close();
        }
    }
}