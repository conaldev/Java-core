import java.util.ArrayList;
import java.util.Scanner;
public class AddElement {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int i=0;i<5;i++){
            System.out.print("\nEnter Element "+(i+1) +" : ");
            a=scanner.nextInt();
            arrayList.add(a);
        }
        System.out.print("\nEnter new value: ");
        int newValue = scanner.nextInt();
        System.out.print("\nEnter index of value: ");
        int index = scanner.nextInt();
        arrayList.add(5,arrayList.get(4));
        for(int k = 4;k>index;k--) {
            arrayList.set(k, arrayList.get(k - 1));
        }
        arrayList.set(index, newValue);
        System.out.println("\nArray after: ");
            System.out.print(arrayList);
    }
}
