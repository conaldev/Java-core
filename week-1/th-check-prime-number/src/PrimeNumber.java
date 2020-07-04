import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if(isPrime(number))
            System.out.println(number+" is a prime number");
        else
            System.out.println(number+" is NOT a prime number");
    }
    public static boolean isPrime(int num) {
        if(num<2) return false;
        if(num==2) return true;
        for(int i=2;i<=Math.sqrt(num);i++) {
            if(num%2==0) return false;
        }
        return true;
    }
}
