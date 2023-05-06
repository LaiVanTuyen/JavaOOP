import java.util.Scanner;

class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle() {

    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public  Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return 3.14*radius*radius;
    }
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}
class Cylinder extends Circle {
    double height = 1.0;
    public Cylinder() {

    }
    public Cylinder(double height) {
        super();
        this.height = height;
    }
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return super.getArea()*height;
    }
    @Override
    public String toString() {
        return "Cylinder: radius=" + String.format("%.1f", getRadius()) + ", height=" + String.format("%.1f", height) + ", " + getColor().toUpperCase() + ", volume=" + String.format("%.1f", getVolume());
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            int constructor = scanner.nextInt();
            switch (constructor) {
                case 0:
                    Cylinder cylinder = new Cylinder();
                    System.out.println(cylinder);
                    break;
                case 1:
                    double height = scanner.nextDouble();
                    Cylinder cylinder1 = new Cylinder(height);
                    System.out.println(cylinder1);
                    break;
                case 2:
                    double radius = scanner.nextDouble(), height1 = scanner.nextDouble();
                    Cylinder cylinder2 = new Cylinder(radius, height1);
                    System.out.println(cylinder2);
                    break;
                case 3:
                    double radius1 = scanner.nextDouble(), height2 = scanner.nextDouble();
                    String color = scanner.nextLine().replaceFirst(" ", "");
                    Cylinder cylinder3 = new Cylinder(radius1, height2, color);
                    System.out.println(cylinder3);
                    break;
                default:
                    break;
            }
        }
    }
}