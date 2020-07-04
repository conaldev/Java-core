import java.util.Scanner;
public class convertMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (USD):");
        int usd = scanner.nextInt();
        int vnd = usd*23000;
        System.out.println("VND = "+vnd);
    }
}
