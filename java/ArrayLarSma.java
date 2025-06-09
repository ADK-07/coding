
import java.util.Scanner;

public class ArrayLarSma {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the length of array:");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("enter the elements of array:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            int LargestEle = arr[0];
            int SmallestEle = arr[0];
            
            for (int num : arr) {
                if (num < SmallestEle) {
                    SmallestEle = num;
                }
                if (num > LargestEle) {
                    LargestEle = num;
                }
            }
            
            System.out.println("largest element is :" + LargestEle);
            System.out.println("Smallest element is :" + SmallestEle);
        }
    }
    
}
