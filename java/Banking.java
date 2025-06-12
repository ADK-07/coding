
import java.util.Scanner;

public class Banking {

    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        

            double balance = 0.0;
            int choice;
            boolean isRunning = true;

            while(isRunning) {

                System.out.println("BANKING PROGRAM");
                System.out.println("****************");

                System.out.println("   MENU   ");
                System.out.println();
                System.out.println("1. SHOW BALANCE");
                System.out.println("2. DEPOSIT");
                System.out.println("3. WITHDRAW");
                System.out.println("4. EXIT");

                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                
                switch(choice) {
                    case 1 -> showbalance(balance);
                    case 2 -> balance += deposit();
                    case 3 -> balance -= withdraw(balance);
                    case 4 -> isRunning = false;
                    default -> System.out.println("Invalid option");
                }
                System.out.println("---------------------------------");
                System.out.println("Thank you! Have a Nice day!");
                System.out.println("---------------------------------");


            } 
   
    }

    static void showbalance(double balance) {
        System.out.println("--------------");
        System.out.printf("$%.2f\n\n", balance);
    }
    static double deposit() {

        double amount;
        System.out.print("Enter the amount you want to deposit: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Deposit amount cannot be negative .");
            return 0;
        }
        else {
            return amount;
        } 
    }   
    static double withdraw(double balance) {
        
        double amount;
        System.out.println("Enter the amount to be withdrawn.");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("------------------");
            System.out.println("INSUFFICIENT FUND.");
            return 0;
        }
        else if (amount < 0) {
            System.out.println("-----------------------");
            System.out.println("Amount cannot be negative ");
            return 0;
        }
        else {
            return amount;
        }
    }
    
}
   

    
