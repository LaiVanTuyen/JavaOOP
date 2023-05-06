import java.util.Scanner;

class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY() {
        this.y = y;
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "Point: (" + x + "," + y + ")";
    }
}
class Line {
    private Point point1;
    private Point point2;
    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }
    public Line(int x1, int y1, int x2, int y2) {
        this.point1 = new Point(x1, y1);
        this.point2 = new Point(x2, y2);
    }
    public Point getPoint1() {
        return point1;
    }
    public Point getPoint2() {
        return point2;
    }
    public double distance() {
        return java.lang.Math.sqrt((point1.getX()-point2.getX())*(point1.getX()-point2.getX()) + (point1.getY()-point2.getY())*(point1.getY()-point2.getY()));
    }
    public double gradient() {
        return Math.atan2(point2.getY() - point1.getY(), point2.getX() - point1.getX());
    }
    @Override
    public String toString() {
        return "Line[Point[" + point1.getX() + ", " + point1.getY() + "], Point[" + point2.getX() + ", " + point2.getY() + "]]";
    }
}
class LineIh extends Point{
    private Point point;
    public LineIh(Point point1, Point point2) {
        super(point2.getX(),point2.getY());
        this.point = point1;
    }
    public LineIh(int x1, int y1, int x2, int y2) {
        super(x2,y2);
        point = new Point(x1, y1);
    }
    public Point getPoint() {
        return point;
    }
    public double distance() {
        return java.lang.Math.sqrt((point.getX()-super.getX())*(point.getX()-super.getX()) + (point.getY()-super.getY())*(point.getY()-super.getY()));
    }
    public double gradient() {
        return Math.atan2(super.getY() - getPoint().getY(), super.getX() - point.getY());
    }
    @Override
    public String toString() {
        return "Line[Point[" + point.getX() + ", " + point.getY() + "], Point[" + super.getX() + ", " + super.getY() + "]]";
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            String option = scanner.next();
            int x1, y1, x2, y2;
            x1 = scanner.nextInt();
            y1 = scanner.nextInt();
            x2 = scanner.nextInt();
            y2 = scanner.nextInt();
            switch (option) {
                case "CPoint":
                    Point point1 = new Point(x1, y1);
                    Point point2 = new Point(x2, y2);
                    Line line = new Line(point1, point2);
                    System.out.println(line);
                    break;
                case "Cint":
                    Line line1 = new Line(x1, y1, x2, y2);
                    System.out.println("Line[[" + line1.getPoint1().getX() + ", " + line1.getPoint1().getY()+ "], [" + line1.getPoint2().getX() + ", " + line1.getPoint2().getY() + "]]");
                    break;
                case "IPoint":
                    LineIh line2 = new LineIh(new Point(x1, y1), new Point(x2, y2));
                    System.out.println(line2);
                    break;
                case "Iint":
                    LineIh line3 = new LineIh(x1, y1, x2, y2);
                    System.out.println("Line[[" + line3.getPoint().getX() + ", " + line3.getPoint().getY()+ "], [" + line3.getX() + ", " + line3.getY() + "]]");
                    break;
                case "LEN":
                    Line line4 = new Line(x1, y1, x2, y2);
                    System.out.format("%.2f\n", line4.distance());
                    break;
                case "GRA":
                    Line line5 = new Line(x1, y1, x2, y2);
                    System.out.format("%.2f\n", line5.gradient());
                    break;
                default:
                    break;
            }
        }
    }
}