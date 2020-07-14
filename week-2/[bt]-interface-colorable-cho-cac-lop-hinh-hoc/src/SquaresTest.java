public class SquaresTest {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square(3);
        squares[1] = new Square(5,"red",true);
        squares[2] = new Square(7);

        for(int i=0;i<3;i++){
            System.out.println(squares[i]);
            squares[i].howToColor();
        }
    }
}
