import java.util.Scanner;
//conaldev
public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number to read: ");
        int number = scanner.nextInt();
        int ones, tens, hundreds;
        if (number > 0 && number <= 10) {
            System.out.println("The number is " + convert(number));
        } else if(number<20) {
            if(number == 11)
                System.out.println("The mumber is eleven ");
            else if(number == 12)
                System.out.println("The number is twelve");
            else if(number == 13)
                System.out.println("The number is thirteen");
            else if(number == 14)
                System.out.println("The number is fifteen");
            else {
                System.out.println("The number is "+convert(number%10)+"teen");
            }
        } else if(number<100) {
            ones = number%10;
            tens = (number/10)%10;
            System.out.print("The number is ");
           readTens(tens,ones);
        } else if(number<1000) {//conaldev
            hundreds = (number/100)%10;
            ones = number%10;
            tens = (number/10)%10;
            System.out.print("The number is " + convert(hundreds) + " hundred and ");
            readTens(tens,ones);
        }
    }//conaldev
    public static void readTens (int tens, int ones) {
        if(tens==2) {
            System.out.println("twenty-"+convert(ones));
        } else if(tens ==3) {
            System.out.println("thirty-"+convert(ones));
        } else if(tens ==5) {
            System.out.println("fifty-"+convert(ones));
        } else {
            System.out.println(convert(tens)+"ty-"+convert(ones));
        }
    }
    public static String convert(int num) {
        String readUinit = "";
        switch (num) {
            case 1://conaldev
                readUinit = "one";
                break;
            case 2:
                readUinit = "two";
                break;
            case 3:
                readUinit = "three";
                break;
            case 4:
                readUinit = "four";
                break;
            case 5:
                readUinit = "five";
                break;
            case 6:
                readUinit = "six";
                break;
            case 7:
                readUinit = "seven";
                break;
            case 8://conaldev
                readUinit = "eight";
                break;
            case 9:
                readUinit = "nine";
                break;
        }//conaldev
        return readUinit;
    }
}
