import java.util.Scanner;
public class DeleteElement {
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
        System.out.println("\nEnter a number to delete: ");
        int x = scanner.nextInt();
        System.out.print("Before delete: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for(int k=0;k<array.length;++k) {
            if(x == array[k]) {
                deleteElement(k,array);
                k--;
            }
        }
        System.out.print("\nAfter delete: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
    public static void deleteElement(int index, int arr[]) {
        for(int i=index;i<arr.length-1;i++) {
            arr[i] = arr[i+1];
            arr[i+1]=0;
        }
    }
}
