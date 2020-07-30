import java.util.Stack;

public class DecimalToBinary {
    private int decimal;

    public int getDecimal() {
        return decimal;
    }

    public void setDecimal(int decimal) {
        this.decimal = decimal;
    }

    public DecimalToBinary(int decimal){
        this.decimal =decimal;
    }
    public StringBuilder decimalToBinary(){
        Stack<Integer> stack = new Stack<>();
        while(decimal>0){
            int mod = decimal%2;
            stack.add(mod);
            decimal/=2;
        }
        StringBuilder binary = new StringBuilder(100);
        while(!stack.isEmpty()){
            binary.append(stack.pop());
        }
        return binary;
    }
}
