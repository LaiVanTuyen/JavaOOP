import java.util.Scanner;

public class Main {
    static class MakeString {
        public String integerToString(int i) {
            return "int i: "+String.valueOf(i);
        }

        public String objIntegerToString(Integer iObj) {
            return "object iObj: "+iObj.toString();
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTestCases = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ kí tự \n thừa
        MakeString makeString = new MakeString();
        for (int i = 0; i < numTestCases; i++) {
            int n = scanner.nextInt();
            String s1 = makeString.integerToString(n);
            String s2 = makeString.objIntegerToString(n);
            System.out.println(s1+", "+s2);
        }
    }
}