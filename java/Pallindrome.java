import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the String :");
            String str = sc.nextLine();
            String reversed = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                reversed += str.charAt(i);
            }

            if (str.equals(reversed)) {
                System.out.println("the string is pallindrome");
            } else {
                System.out.println("the string is not pallindrome");
            }
        }
    }
}
