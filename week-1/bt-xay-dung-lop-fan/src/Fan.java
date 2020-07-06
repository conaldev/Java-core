public class Fan {
    public Fan() {}

    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST =3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    public int getSpeed() {
        return this.speed;
    }
    public boolean getOn() {
        return this.on;
    }
    public double getRadius() {
        return this.radius;
    }
    public String getColor() {
        return this.color;
    }
    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }
    public void setOn(boolean newOn) {
        this.on = newOn;
    }
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }
    public void setColor(String newColor) {
        this.color = newColor;
    }
    public String toString() {
        if(this.on)
            return "Fan is on: \nspeed: " + this.speed + "\ncolor: " + this.color  +"\nradius: " + this.radius;
        else
            return "Fan is off: \ncolor: " + this.color  +"\nradius: " + this.radius;
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println("About Fan 1: " +fan1.toString());
        System.out.println("About Fan 2: " + fan2.toString());
    }
}
