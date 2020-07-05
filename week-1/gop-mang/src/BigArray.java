import java.util.ArrayList;
import java.util.Scanner;

public class BigArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the length of first array: ");
        int length1 = scanner.nextInt();
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>(length1);
        for(int i=0;i<length1;i++) {
            System.out.print("Enter element " +(i+1)+" : ");
            int num = scanner.nextInt();
            arrayList1.add(num);
        }
        System.out.printf("Enter the length of first array: ");
        int length2 = scanner.nextInt();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>(length2);
        for(int i=0;i<length2;i++) {
            System.out.print("Enter element " +(i+1)+" : ");
            int num = scanner.nextInt();
            arrayList2.add(num);
        }
        ArrayList<Integer> arrayList3 = new ArrayList<Integer>(length1+length2);
        arrayList3.addAll(0,arrayList1);
        arrayList3.addAll(length1,arrayList2);
        System.out.println("Big Array = "+ arrayList3);
    }
}
