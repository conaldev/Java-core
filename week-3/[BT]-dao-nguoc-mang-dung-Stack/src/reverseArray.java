import java.util.Stack;

public class reverseArray {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6,7,8,9};
        Stack<Integer> starr = new Stack<Integer>();
        for(int x : arr){
            starr.add(x);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=starr.pop();
        }
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
