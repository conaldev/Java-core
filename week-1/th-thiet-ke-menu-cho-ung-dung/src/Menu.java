import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1: Draw the triagnle");
        System.out.println("2: Draw the square");
        System.out.println("3: Draw the rectangle");
        System.out.println("0: Exit");
        System.out.println("Enter your choice");

        while (true) {
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    for(int i=1;i<=5;i++) {
                        for(int j=1;j<=i;j++) {
                            System.out.printf("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for(int i=1;i<=5;i++) {
                        for(int j=1;j<=5;j++) {
                            System.out.printf("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for(int i=1;i<=5;i++) {
                        for(int j=1;j<=6;j++) {
                            System.out.printf("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid number. Enter another number");
            }
        }
    }
}
