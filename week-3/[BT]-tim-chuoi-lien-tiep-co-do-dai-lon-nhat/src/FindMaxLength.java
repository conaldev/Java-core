import java.util.LinkedList;
import java.util.Scanner;

public class FindMaxLength {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();
        LinkedList<Character> max = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();

        for(int i=0;i<string.length();i++){
            if(list.size()>1 && string.charAt(i) <= list.getLast() )
                list.clear();
            list.add(string.charAt(i));
            if(list.size()>max.size()){
                max.clear();
                max.addAll(list);
            }
        }
        for(char ch : max)
            System.out.print(ch);
    }
}
