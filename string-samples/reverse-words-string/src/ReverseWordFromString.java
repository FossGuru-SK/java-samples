import java.util.Stack;
import java.util.StringTokenizer;

public class ReverseWordFromString {

    public static void main(String[] args) {

        String input = "How are you doing";

        StringBuilder reverseString = new StringBuilder();

        StringTokenizer stringTokenizer = new StringTokenizer(input, " ");

        Stack<String>  myStack = new Stack<>();

        while (stringTokenizer.hasMoreTokens()) {
            myStack.push(stringTokenizer.nextToken());
        }

        while (!myStack.isEmpty()){
            reverseString.append(myStack.pop()).append(" ");
        }

        System.out.println(reverseString);

    }
}