
import java.util.Scanner;

public class StrConcat {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the first name:");
            String firstName = sc.nextLine();
            System.out.println("Enter the last name:");
            String lastName = sc.nextLine();
            System.out.println("the full name is :");
            System.out.println(firstName.concat(lastName));
            sc.close();
        }
    }
}
