
import java.lang.StringBuffer;
import java.util.Scanner;

class MakeSentence {
    public static StringBuffer make(StringBuffer string) {
        for(char i = 'A'; i <= 'Z'; i++) {
            int index = string.indexOf(String.valueOf(i));
            while(index != -1) {
                if(index > 0) string.insert(index - 1, '.');
                index = string.indexOf(String.valueOf(i), index + 2);
            }
        }
        if(string.charAt(0) =='.') {
            string.deleteCharAt(0);
        }
        string.insert(string.length(), '.');
        return string;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfSentence = scanner.nextInt() - 1;
        StringBuffer line = new StringBuffer(scanner.next());
        while(numOfSentence-- > 0) {
            line.append(" ").append(scanner.next());
        }
        StringBuffer newLine = MakeSentence.make(line);
        System.out.println(newLine);
    }
}