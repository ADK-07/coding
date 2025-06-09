
import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the day:");
            int day = sc.nextInt();

            switch (day) {
                case 1 -> System.out.println("Today is monday");
                case 2 -> System.out.println("Today is Tuesday");
                case 3 -> System.out.println("Today is Wednesday");
                case 4 -> System.out.println("Today is Thursday");
                case 5 -> System.out.println("Today is Friday");
                case 6 -> System.out.println("Today is Saturday");
                case 7 -> System.out.println("Today is Sunday");
                default -> System.out.println("enter vaild date.");
            }
            sc.close();
        }
    }
}