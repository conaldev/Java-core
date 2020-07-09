public class TestMovePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(3.4f,2.4f,5.6f,7.4f);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
