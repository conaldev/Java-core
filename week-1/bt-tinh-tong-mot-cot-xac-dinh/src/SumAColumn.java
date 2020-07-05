import java.util.ArrayList;
import java.util.Scanner;

public class SumAColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the number of rows: ");
        int row = scanner.nextInt();
        System.out.printf("Enter the number of columns: ");
        int column = scanner.nextInt();
        int[][] arr = new int[row][column];
        for(int i=0;i<row;i++) {
            for(int j=0;j<column;j++) {
                System.out.print("Enter the value of element: array["+i+"]["+j+"] = ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.printf("Enter the index of column = ");
        int indexCol=scanner.nextInt();
        int sum=0;
        for(int i=0;i<row;i++) {
           sum+=arr[i][indexCol];
        }
        System.out.println("Sum of elements in "+indexCol+"th column = " +sum);
    }
}
