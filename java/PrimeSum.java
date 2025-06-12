import java.util.Scanner;

public class PrimeSum {

    static boolean isPrime(int num) {

        for (int i = 2 ; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }

    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("enter the number of terms :");
            int element = scanner.nextInt();
            int sum = 0;

            for (int i = 2 ; i <= element; i++) {
                if (isPrime(i)) {
                    sum += i;
                }
            }
            System.out.println(" the sum of " + element + " prime number is :" + sum);
        }
    }
    
}