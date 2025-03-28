import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> SalaryRangeMap =
                Stream.of("5000","2000","3000","4000","1000")
                        .collect(Collectors.teeing(
                                Collectors.maxBy(Integer::compareTo),
                                Collectors.minBy(Integer::compareTo),
                                (s1,s2) -> {
                                    List<Integer> list = new ArrayList<>();
                                    list.add(s1.get());
                                    list.add(s2.get());
                                    return list;
                                }
                        ));
    }
}