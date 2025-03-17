import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateCharFromString {

    public static void main(String[] args) {
        String input = "abcdabceabcf";

        //Using Stream
        Map<Character, Integer> map = new HashMap<>();
        for (char c: input.toCharArray()) {
            map.compute(c, (key, value) -> (value == null)? 1: value + 1);
        }
        System.out.println(map);

        // finding duplicates
        List duplicateChars = map.keySet()
                .stream()
                .filter(k -> map.get(k)>1)
                .toList();
        System.out.println(duplicateChars);


        // find duplicateWithCount
        Map<Character, Integer> duplicatsWithCount = map.entrySet()
                .stream()
                .filter(e-> map.get(e.getKey()) > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(duplicatsWithCount);

        //Using Streams - collector groupingby
        String givenString = "jJavajjjjprogram";
        Map<String, Long> map1 = Arrays.stream(givenString.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map1);
    }

}