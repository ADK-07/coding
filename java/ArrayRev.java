import java.util.Arrays;
import java.util.Scanner;

public class ArrayRev {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the length of array:");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter the elements of array:");
            for (int i = 0; i < n ; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("the array is :\n" + Arrays.toString(arr));

            System.out.println("the reversed array is :"); 
            for (int i = n - 1; i >=0; i--) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}
