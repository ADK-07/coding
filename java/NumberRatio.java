
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//this is a program to calculate the ratio of number of positive , negative , zero in array list
class Result {
    public static void PlusMinus(List<Integer> arr2) {
        double pos = 0.0;
        double neg = 0.0;
        double zero = 0.0;
        int n = arr2.size();

        for (double i : arr2) {
            if ( i > 0 ) {
                pos++;
            } else if ( i < 0 ) {
                neg++;
            } else {
                zero++;
            }
        }
        System.out.println(String.format("%.6f", (double) pos / n));
        System.out.println(String.format("%.6f", (double) neg / n));
        System.out.println(String.format("%.6f", (double) zero / n));
    }
}
public class NumberRatio {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the size of array:");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("enter the elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            List< Integer > arr2 = new ArrayList<>();

            for (int i : arr) {
                arr2.add(i);
            }

            Result.PlusMinus(arr2);
            sc.close();
        }
    }
}
