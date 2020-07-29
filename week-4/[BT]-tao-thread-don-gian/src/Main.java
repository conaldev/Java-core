public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator1 = new NumberGenerator();
        NumberGenerator numberGenerator2 = new NumberGenerator();
        Thread num1 = new Thread(numberGenerator1);
        Thread num2 = new Thread(numberGenerator2);
        num1.start();
        num2.start();
    }
}
