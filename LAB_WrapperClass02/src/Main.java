import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static class ListNum{
        private ArrayList<String> numbers;
        public ListNum(ArrayList<String> numbers) {
            this.numbers = numbers;
        }

        public String getMidItem() {
            int size = numbers.size();
            if (size == 0) {
                return null;
            }
            int midIndex = size / 2;
            if (size % 2 == 0) {
                // Trả về 2 phần tử nếu danh sách có độ dài chẵn
                return numbers.get(midIndex - 1) + " " + numbers.get(midIndex);
            } else {
                return numbers.get(midIndex).toString();
            }
        }

        public String toString() {
            String midItem = getMidItem();
            if (midItem == null) {
                return "List is empty";
            } else {
                return midItem;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTestCases = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ kí tự \n thừa
        for (int i = 0; i < numTestCases; i++) {
            String[] inputLine = scanner.nextLine().split("\\s+");
            ArrayList<String> numbers = new ArrayList<>();
            for (String s : inputLine) {
                if (s.endsWith("f")) {
                    numbers.add(s.substring(0, s.length() - 1));
                } else {
                    numbers.add(s);
                }
            }
            ListNum listNum = new ListNum(numbers);
            System.out.println(listNum.toString());
        }
    }
}
