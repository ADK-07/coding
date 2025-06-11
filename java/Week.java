
import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the day:");
            String day = sc.nextLine().toLowerCase();

            switch (day) {
                case "monday" , "tuesday" , "wednesday", "thursday", "friday" ->
                 System.out.println("Today is WeekDay ");
                
                case "saturday", "sunday"->
                 System.out.println("Today is weekEnd");
                default ->
                 System.out.println("enter vaild date.");
            }
            sc.close();
        }
    }
}