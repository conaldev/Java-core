import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) throws IOException {
        Stack<Character> bStackIn = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strInput = br.readLine();
        System.out.println(checkBracket(strInput,bStackIn));
    }
    public static boolean checkBracket(String strIn, Stack<Character> bStack) {
        char[] str = strIn.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (str[i] == '(')
                bStack.push(str[i]);
            if (str[i]  == ')')
                if (bStack.isEmpty())
                    return false;
                else {
                    if (str[i-1] != '+' && str[i-1] !='-' &&str[i-1] !='/' && str[i-1] != '*' && str[i-1] !='%')
                        bStack.pop();
                }
        }
        if (!bStack.isEmpty())
            return false;
        return true;
    }
}
