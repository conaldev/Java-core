import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        int[] frequentChar = new int[256];
        for (int i=0;i<inputString.length();i++){
            int ascii = (int) inputString.charAt(i);
            frequentChar[ascii]++;
        }
        int max =0;
        char character = (char) 255;
        for(int i=32;i<256;i++){
            if(max<frequentChar[i]){
                character = (char)i;
                max = frequentChar[i];
            }
        }
        System.out.println("The most appearing letter is '" + character+"' with a frequency of " + max + " times");

    }
}
