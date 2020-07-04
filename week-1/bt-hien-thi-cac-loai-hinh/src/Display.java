import java.util.Scanner;
public class Display {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1: Draw the rectangle");
        System.out.println("2: Draw the square triganle");
        System.out.println("3: Draw isosceles triangle");
        System.out.println("4: Exit");
        System.out.println("Enter your choice");

        while (true) {
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    for(int i=1;i<=5;i++) {
                        for(int j=1;j<=7;j++) {
                            System.out.printf("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Bottom-Left");
                    for(int i=1;i<=5;i++) {
                        for(int j=1;j<=i;j++) {
                            System.out.printf("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("Top-Left");
                    for(int i=5;i>=1;i--) {
                        for(int j=1;j<=i;j++) {
                            System.out.printf("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("Bottom-Right");
                    for(int i=5;i>=1;i--) {
                        for(int j=1;j<=5;j++) {
                            if(j<i) System.out.printf("  ");
                            else System.out.printf("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("Top-Right");
                    for(int i=1;i<=5;i++) {
                        for(int j=1;j<=5;j++) {
                            if(j<i) System.out.printf("  ");
                            else System.out.printf("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for(int i=1;i<=5;i++) {
                        for(int j=4;j>=i;j--)
                            System.out.printf("  ");
                        for(int k=1;k<=2*i-1;k++)
                            System.out.printf("* ");;
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid number. Enter another number");
            }
        }
    }
}
