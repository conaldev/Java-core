import java.util.Scanner;
public class FindMin {
    public static void main(String[] args) {
        int array[],size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int indexMin = findMin(array);
        System.out.println("\nThe smallest property value in the list is " + array[indexMin] + ", at position " + (indexMin+1));
    }
    public static int findMin(int arr[]) {
        int min = arr[0];
        int index = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
                index = j;
            }
        }
        return index;
    }

}
