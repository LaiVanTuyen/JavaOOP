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
        return "Circle[radius=" + String.format("%.1f", radius) + ", area=" + String.format("%.1f", getArea()) + "]";
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
    public double getArea() {
        return 2*3.14*getRadius()*(getRadius()+height);
    }
    @Override
    public String toString() {
        return "Cylinder[radius=" + String.format("%.1f", getRadius()) + ", height=" + String.format("%.1f", height) + ", area=" + String.format("%.1f", getArea()) + "]";
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            String shape = scanner.next();
            switch (shape) {
                case "Ci":
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.println(circle);
                    break;
                case "Cy":
                    double radius1 = scanner.nextDouble();
                    double height = scanner.nextDouble();
                    Cylinder cylinder = new Cylinder(radius1, height);
                    System.out.println(cylinder);
                    break;
                default:
                    break;
            }
        }
    }
}