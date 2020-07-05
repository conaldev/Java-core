import java.util.Scanner;
public class QuadraticEquation {
    QuadraticEquation() {};
    private double a,b,c;
    public void setValue(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }//conaldev
    public double getA() {
        return this.a;
    }
    public double getB() {
        return this.b;
    }
    public double getC() {
        return this.c;
    }//conaldev
    public double getDiscriminant() {
        return Math.pow(this.b,2) - 4*this.a*this.c;
    }//conaldev
    public double getRoot1() {
        if(getDiscriminant()>0)
            return (-b+Math.pow(getDiscriminant(),0.5))/(2*a);
        else if(getDiscriminant()==0)
            return -b/(a*2);
        else
            return 0;
    }
    public double getRoot2() {
        if(getDiscriminant()>0)
            return (-b-Math.pow(getDiscriminant(),0.5))/(2*a);
        else if(getDiscriminant()==0)
            return -b/(a*2);
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a,b,c of QuadraticEquation ax^2 +bx+c=0");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation();
        equation.setValue(a,b,c);
        if(equation.getDiscriminant()>0)
            System.out.println("The equation has two roots " + equation.getRoot1() + " and " + equation.getRoot2());
        else if(equation.getDiscriminant()==0)
            System.out.println("The equation has one root " + equation.getRoot1());
        else
            System.out.println("The equation has no real roots");
    }
}//conaldev
