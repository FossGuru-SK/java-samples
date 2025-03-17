import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String input = "abdbsdbsjsbfdskfbdsb";

        //Using Stream sort
        String sortedString = Stream.of(input.split(""))
                .sorted()
                .collect(Collectors.joining());
        System.out.println(sortedString);

        //Using array sort
        char[] arr = input.toCharArray();
        Arrays.sort(arr);
        String sortedArrayString = String.valueOf(arr);
        System.out.println(sortedArrayString);

        //Without Sort method
        char[] stringArray = input.toCharArray();
        char temp;
        int i = 0;

        while (i < stringArray.length) {
            int j = i+1;
            while (j < stringArray.length) {
                if ( stringArray[j] < stringArray[i]) {
                    temp = stringArray[i];
                    stringArray[i] = stringArray[j];
                    stringArray[j] = temp;
                }
                j += 1;
            }
            i += 1;
        }
        System.out.println(String.valueOf(stringArray));

    }
}