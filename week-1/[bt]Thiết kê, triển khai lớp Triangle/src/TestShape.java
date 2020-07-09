import java.util.Scanner;

public class TestShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your color: ");
        String color = scanner.nextLine();
        Shape shape = new Shape();
        shape.setColor(color);
        System.out.println(shape);


    }
}
