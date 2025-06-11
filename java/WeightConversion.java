
import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        //weight conversion program

        try (Scanner sc = new Scanner(System.in)) {
            double weight;
            double newWeight;
            int choice;

            System.out.println("This is a weight conversion program.");
            System.out.println("1. convert lbs to kgs.");
            System.out.println("2. convert kgs to lbs.");

            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter your weight in lbs :");
                    weight = sc.nextDouble();
                    newWeight = weight * 0.453592;
                    System.out.println("your weight in kgs is :" + newWeight);
                }
                case 2 -> {
                    System.out.print("Enter your weight in kgs :");
                    weight = sc.nextDouble();
                    newWeight = weight * 2.20462262;
                    System.out.println("your weight in lbs is : " + newWeight);
                }
                default -> System.out.println("your choice is wrong.");
            }


        sc.close();
        }

    }
    
}
