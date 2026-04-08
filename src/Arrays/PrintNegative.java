package Arrays;
import java.util.Scanner;
public class PrintNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        // taking inputs
        System.out.println("Enter the elements: ");
        for(int i = 0 ; i<n;i++){
            arr[i]=sc.nextInt();
        }
        // printing all elements
        System.out.println("Elements of the array");
        for(int i = 0; i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        // printing negative values
        System.out.println("Negative elements");
        for(int i = 0; i<n;i++){
          if (arr[i]<0) {
              System.out.print(arr[i]+ " ");
          } }
    }
}
