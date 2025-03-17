import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringJoinnerDemo {
    public static void main(String[] args) {

        //Java 8 StringJoinner
        StringJoiner stringJoiner1 = new StringJoiner(",");
        StringJoiner stringJoiner2 = new StringJoiner(",", "[", "]");

        stringJoiner1.add("Sujit");
        stringJoiner1.add("Karne");
        System.out.println(stringJoiner1);

        stringJoiner2.add("Sujit");
        stringJoiner2.add("Karne");
        System.out.println(stringJoiner2);

        String merged = stringJoiner2.merge(stringJoiner1).toString();
        System.out.println(merged);

        // Java 8 Collectors.joining()
        String result = Stream.of("a","b","c").collect(Collectors.joining(",","{","}"));
        System.out.println(result);

    }
}