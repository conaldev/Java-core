import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 3 cạnh của tam giác: ");
        double x,y,z;
         x = scanner.nextDouble();
        y = scanner.nextDouble();
         z = scanner.nextDouble();
        try {
           creatTriangle(x,y,z);
        } catch (IllegalTriangleException e ){
            System.err.println(e.fillInStackTrace());
        }
    }
    static void creatTriangle(double firstSide, double secondSide, double thirdSide) throws  IllegalTriangleException {
        if(firstSide<=0 || secondSide<=0 || thirdSide<=0 || firstSide+secondSide<=thirdSide || firstSide+thirdSide<=secondSide || secondSide+thirdSide<= firstSide)
            throw new IllegalTriangleException("Invalid sides LOL");
    }
    public static class IllegalTriangleException extends Exception{
        public IllegalTriangleException(){
            super("IllegalTriangle!");
        }
        public IllegalTriangleException(String string){
            super(string);
        }
    }
}
