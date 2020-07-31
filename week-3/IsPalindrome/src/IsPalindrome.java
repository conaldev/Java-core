import java.util.Scanner;
import java.util.Stack;

public class IsPalindrome {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        System.out.println("Please enter the string to check Palindrome:");
        Scanner scanner = new Scanner(System.in);
        String originalString = scanner.nextLine();
        System.out.println("Original string:");
        System.out.println(originalString);
        for (int i = 0; i < originalString.length(); i++) {
            stack.add(originalString.charAt(i));
        }
        String reverseString = "";
        for (int i = 0; i < originalString.length(); i++) {
            reverseString += stack.pop();
        }
        System.out.println("Reverse string: ");
        System.out.println(reverseString);
        boolean isPalindrome = originalString.toLowerCase().replace(" ","").equals(reverseString.toLowerCase().replace(" ",""));
        if (isPalindrome){
            System.out.println("The string is Palindrome string.");
        }else{
            System.out.println("The string is not a Palindrome string.");
        }
    }
}
