
import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Random random = new Random();
        try (Scanner sc = new Scanner(System.in)) {
            int guess;
            int attempt = 0;
            int min = 1;
            int max = 101;
            
            int randomNumber = random.nextInt(min, max);

            do { 
                System.out.println("enter your guess");
                 guess= sc.nextInt();
                 attempt++;

                 if (guess < randomNumber) {
                    System.out.println("The guess is too low!");
                 }
                 else if ( guess > randomNumber) {
                    System.out.println("The guess is too high");
                 }
                 else {
                    System.out.println("correct! the number is " + randomNumber + " your guessed it in " + attempt + "attempt");
                 }
            } while (guess != randomNumber);
        }
    }
}
