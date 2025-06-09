import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        int vowels = 0;
        int consonents = 0;
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the String:");
            String word = sc.nextLine();
            word = word.toLowerCase();

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
                    vowels++;
                } else {
                    consonents++;
                }
            }

            System.out.println("number of vowels in string is " + vowels + " number of consonents is " + consonents);
        }
    }
}
