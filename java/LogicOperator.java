import java.util.Scanner;

public class LogicOperator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String username;

            System.out.print("Enter the username : ");
            username = sc.nextLine();

            if (username.length() < 4 || username.length() > 12) {
                System.out.println("The username must be within 4 - 12 characters.");
            }
            else if (username.contains(" ") || username.contains("_")) {
                System.out.println("username must be characters.");
            }
            else {
                System.out.println("welcome " + username);
            }
            sc.close();
        }
    }
    
}
