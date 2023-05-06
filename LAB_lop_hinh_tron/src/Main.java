public class Main {
    private double r;
    private String color;

    public void Main() {
        this.r = 1.0;
        this.color = "red";
    }

    public double getR(){
        return this.r;
    }
    public String getColor(){
        return this.color;
    }

    public double calS(){
        return Math.PI*this.getR()*this.getR();
    }

    public static void main(String[] args) {
        Main o = new Main();
        o.Main();
        //System.out.println(o.getR());
        System.out.println(o.getR()+" "+o.getColor());
        System.out.println(o.calS());
    }
}