import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        System.out.printf("Enter the prime amount: ");
        int numbers = scanner.nextInt();
        System.out.print("2 ");
        int N =3;
        while (count<numbers) {
            if(isPrime(N))
                System.out.print(N+ " ");
            N+=2;
            ++count;
        }
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
