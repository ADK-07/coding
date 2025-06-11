
import java.util.Scanner;

public class SubStringMethod {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("enter the email: ");
            String email = sc.nextLine();
            String username = email.substring(0 , email.indexOf('@'));
            String domain = email.substring(email.indexOf('@') + 1 );

            System.out.println("your username is : " + username);
            System.out.println("your domain is : " + domain);
            
            sc.close();
        } 
    }
    
}
