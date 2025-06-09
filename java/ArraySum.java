import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the array size:");
            int n = sc.nextInt();
            int i, sum = 0;
            int[] arr = new int[n];

            System.out.println("enter the elements");
            for (i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (int num : arr) {
                sum += num;
            }
            System.out.println("sum of the elements in the array is :" + sum);
        }
    }
}
