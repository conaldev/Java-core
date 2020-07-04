import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year to check");
        int year = scanner.nextInt();

        boolean isLeapYear = year%400==0 || (year%4==0 && year%100!=0);
        if(isLeapYear)
            System.out.printf("%d is a Leap Year ", year);
        else
            System.out.printf("%d is NOT a Leap Year", year);
    }
}
