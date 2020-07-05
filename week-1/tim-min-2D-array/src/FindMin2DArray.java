import java.util.ArrayList;
import java.util.Scanner;

public class FindMin2DArray {
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
        int min = arr[0][0];
        int indexRow=0;
        int indexCol=0;
        for(int i=0;i<row;i++) {
            for(int j=0;j<column;j++) {
                if(min>arr[i][j]) {
                    min= arr[i][j];
                    indexCol=j;
                    indexRow =i;
                }
            }
        }
        System.out.print("\n MIN element in 2DArray = "+min+"  index row = "+indexRow+" index col = "+indexCol);
    }
}
