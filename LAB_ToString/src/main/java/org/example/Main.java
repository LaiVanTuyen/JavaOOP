package org.example;

import java.util.Scanner;

class Circle{
    private double radius=1.0;

    public Circle(double radius) {
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }

    public double getCircumference(){
        return 2.0*Math.PI*this.radius;
    }

    @Override
    public String toString() {
        return "Circle[" + "radius=" + String.format("%.3f", radius) + "]";
    }
}

public class Main{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        sc.nextLine();

        while(test-->0){
            String[] s=sc.nextLine().trim().replaceAll("\\s+"," ").split(" ");
            Circle c;

            if(s[1].equalsIgnoreCase("get"))
                System.out.printf("%.3f\n",Double.valueOf(s[0]));

            else if(s[1].equalsIgnoreCase("set")){
                c=new Circle(Double.parseDouble(s[2]));
                System.out.println(c);

            } else if(s[1].equalsIgnoreCase("A")){
                c=new Circle(Double.parseDouble(s[0]));
                System.out.printf("%.3f\n",c.getArea());

            } else if(s[1].equalsIgnoreCase("C")){
                c=new Circle(Double.parseDouble(s[0]));
                System.out.printf("%.3f\n",c.getCircumference());

            } else{
                c=new Circle(Double.parseDouble(s[0]));
                System.out.println("Call explicitly: "+c.toString());
                System.out.println("Call implicitly: "+c);
            }
        }
    }
}