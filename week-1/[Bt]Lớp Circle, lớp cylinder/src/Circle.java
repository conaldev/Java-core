public class Circle {
    private int radius = 1;
    private String color = "blue";
    public Circle(){}
    public int getRadius() {
        return this.radius;
    }
    public void setRadius(int raidus){
        this.radius = raidus;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return Math.PI*Math.pow(this.radius,2);
    }
    public double getPerimeter(){
        return 2*Math.PI*this.radius;
    }

    @Override
    public String toString() {
        return "This circle has radius = "
                + getRadius()
                +", color = "
                + getColor()
                +", Area = "
                + getArea()
                +", Perimeter = "
                + getPerimeter();
    }
}
