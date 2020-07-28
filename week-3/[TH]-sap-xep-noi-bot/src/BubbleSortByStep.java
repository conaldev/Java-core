import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size: ");
        int size = scanner.nextInt();
        int list[] = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for(int i=0;i<list.length;i++){
            list[i] = scanner.nextInt();
        }
        System.out.println("Your input list: ");
        for(int i=0;i<list.length;i++){
            System.out.print(list[i]+"\t");
        }
        System.out.printf("\nBegin sort processing...\n");
        bubbleSortByStep(list);
    }
    public static void bubbleSortByStep(int[] list){
        boolean needNextPass = true;
        for(int k=1;k<list.length && needNextPass; k++){
            needNextPass = false;
            for(int i=0;i<list.length -k;i++){
                System.out.print("Swap " + list[i] +" with " + list[i+1] + " | ");
                int temp = list[i];
                list[i]=list[i+1];
                list[i+1] = temp;
                needNextPass = true;
            }
            if(needNextPass==false){
                System.out.print("\nArray may be sorted and next pass not needed");
                break;
            }
            System.out.print("\nList after the " + k+ " sort: ");
            for(int j=0;j<list.length;j++){
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }
}