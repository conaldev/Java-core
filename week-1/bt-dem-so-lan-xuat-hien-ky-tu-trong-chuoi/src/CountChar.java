import java.util.Scanner;
public class CountChar {
    public static void main(String[] args) {
        String str = "remote: Resolving deltas: 100% (4/4), completed with 4 local objects.";
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter your character: ");
        char ch = scanner.next().charAt(0);
        int count =0;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i) == ch) ++count;
        }
        System.out.println("Số lần xuất hiện của ký tự: "+ch+" trong chuỗi là " + count );
    }
}
