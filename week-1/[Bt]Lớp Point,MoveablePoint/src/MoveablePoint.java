import java.util.Arrays;

public class MoveablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed){}
    public  MoveablePoint(float xSpeed, float ySpeed);
    public MoveablePoint(){}
    public float getXSpeed(){
        return this.xSpeed;
    }
    public void setXSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }
    public float getYSpeed(){
        return this.ySpeed;
    }
    public void setYSpeed(float ySpeed){
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] arr = {this.xSpeed, this.ySpeed};
        return arr;
    }

    @Override
    public String toString() {
        return "(x,y) = "
                +this.getXY();
                +"(xSpeed,ySpeed) = "
                + ArraysgetSpeed());
    }
}
