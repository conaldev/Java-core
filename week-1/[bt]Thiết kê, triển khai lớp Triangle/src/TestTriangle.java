import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the color of your triangle: ");
        String color = scanner.nextLine();
        System.out.println("Enter 3 side of your triangle: ");
        double side1 = scanner.nextDouble(),
               side2 = scanner.nextDouble(),
               side3 = scanner.nextDouble();
        Triangle triangle = new Triangle(side1,side2,side3,color);
        System.out.println(triangle);
    }
}
