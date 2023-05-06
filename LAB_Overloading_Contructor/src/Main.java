import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        class Circle {
            double r  = 1.0;
            String color = "red";

            public double showR() {
                return this.r;
            }
            public String showColor(){
                return this.color;
            }

        }



        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- >0) {
            double newr = sc.nextDouble();
            String newcolor = sc.nextLine();
            if (newr == -1) {
                Circle obj = new Circle();
                System.out.println(obj.showR() + " "+ obj.showColor());
            } else if (newcolor.trim().length()==0){
                Circle obj = new Circle();
                obj.r = newr;
                System.out.println(obj.showR() + " "+ obj.showColor());
            } else {
                Circle obj = new Circle();
                obj.r = newr;
                obj.color = newcolor.trim();
                System.out.println(obj.showR() + " "+ obj.showColor());
            }
        }
    }
}