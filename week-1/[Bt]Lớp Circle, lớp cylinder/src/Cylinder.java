public class Cylinder extends Circle {
    private int height = 1;
     public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return this.height;
    }
    public double getVolume() {
         return this.height*getArea();
    }

    @Override
    public String toString() {
        return "This cylinder has radius = "
                +getRadius()
                +", height ="
                +getHeight()
                +", color = "
                + getColor()
                + ", volume = "
                +getVolume();
     }
}
