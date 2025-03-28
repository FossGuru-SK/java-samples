import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorTeeingMethodDemo {

    public static void main(String[] args) {

        //Get Highest and Lowest Salary of employee
        Map<String, Integer> result =
                Stream.of(5000,3000,6000,1000,4000,2000)
                        .collect(Collectors.teeing(
                                Collectors.maxBy(Integer::compareTo),
                                Collectors.minBy(Integer::compareTo),
                                (s1, s2) -> {
                                    HashMap<String, Integer> map = new HashMap<>();
                                    map.put("Highest", s1.get());
                                    map.put("Lowest", s2.get());
                                    return map;
                                }
                        ));
        System.out.println(result);

        String text = """
                hi, how are you?
                """;
        System.out.println(text);
    }
}