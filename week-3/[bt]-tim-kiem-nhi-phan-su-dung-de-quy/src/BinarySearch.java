import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = scanner.nextInt();
        int arr[] = new int[length];
        for(int i=0;i<length;i++){
            System.out.println("Enter element " + (i+1)+ " : ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter your number: ");
    }
}
