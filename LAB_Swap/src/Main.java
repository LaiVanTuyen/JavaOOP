import java.util.Scanner;

public class Main {
    static class Number {
        int num;

        public Number(int num) {
            this.num = num;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }
    }
    static class Swap {
        public static void swap(Number a, Number b) {
            int temp = a.getNum();
            a.setNum(b.getNum());
            b.setNum(temp);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            Number a = new Number(sc.nextInt());
            Number b = new Number(sc.nextInt());
            Swap.swap(a, b);
            System.out.println(a.getNum() + " " + b.getNum());
        }
    }
}