import java.util.Scanner;
public class Body {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float weight,height;
        System.out.print("Your weight (in kilogram): ");
        weight = scanner.nextFloat();

        System.out.print("Your height (in meter): ");
        height = scanner.nextFloat();

        float bmi = (float) (weight/Math.pow(height,2));

        if(bmi < 18)
            System.out.printf("%-20.2f%s",bmi, "Underweight");
        else if(bmi < 25)
            System.out.printf("%-20.2f%s",bmi,"Normal");
        else if(bmi < 30)
            System.out.printf("%-20.2f%s",bmi,"Overwieght");
        else
            System.out.printf("%-20.2f%s",bmi,"Obese");
    }
}
