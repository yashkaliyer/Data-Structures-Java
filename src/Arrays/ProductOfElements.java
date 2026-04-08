package Arrays;
import java.util.*;
public class ProductOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int product = 1;
        int [] arr = new int [n];
        // taking input
        System.out.println("Enter the elements: ");
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
            product*=arr[i];
        }
        // printing the sum
        System.out.println("Sum of all elements: "+product);

    }
}

