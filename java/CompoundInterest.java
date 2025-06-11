import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double principle;
            double rate;
            int timesCompounded;
            int year;
            double amount;

            System.out.print("Enter the amount principle amount: ");
            principle = sc.nextDouble();

            System.out.print("Enter the interest rate (in %):");
            rate = sc.nextDouble() / 100;

            System.out.print("Enter the number of times compounded per year : ");
            timesCompounded = sc.nextInt();

            System.out.print("Enter the number of year : ");
            year = sc.nextInt();

            amount = principle * Math.pow(1 + rate / timesCompounded, timesCompounded * year);

            System.out.printf("The amount after %d years is $%.2f",year , amount);
            sc.close();
        }
    }
    
}
