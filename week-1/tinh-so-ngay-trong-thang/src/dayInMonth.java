import java.util.Scanner;
public class dayInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("which month that you want to count day? ");
        int month = scanner.nextInt();

        switch (month) {
            case 2:
                System.out.println("The month '2' has 28 or 29 days!");
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("The month '%d' has 31 days! ", month);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("The month '%d' has 30 days",month);
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }
    }
}
