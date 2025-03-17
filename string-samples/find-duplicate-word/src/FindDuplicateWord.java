import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateWord {

    public static void main(String[] args) {
        String input = "Sujit Foss Sujit Foss Guru Sujit";

        //Using Stream approach
        List<String> wordsList = Arrays.stream(input.split(" ")).toList();
        Set<String> set = new HashSet<>();
        List<String> duplicatList = wordsList.stream()
                .filter(w -> !set.add(w))
                .collect(Collectors.toList());
        System.out.println(duplicatList);
        Map<String, Integer> wordMapWithCount = wordsList.stream()
                .collect(Collectors.toMap(Function.identity(), word -> 1, Math::addExact));
        System.out.println(wordMapWithCount);
        Map<String,Integer> duplicateWordWithCount = wordMapWithCount.entrySet()
                .stream().filter(e -> e.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(duplicateWordWithCount);

        //Using Collections
        List<String> collectionWords = Arrays.asList(input.split(" "));
        Set<String> tempSet = new HashSet<>();
        List<String> duplicateWords = new ArrayList<>();
        for (String word: collectionWords) {
            if (!tempSet.add(word)) {
                duplicateWords.add(word);
            }
        }
        System.out.println(duplicateWords);
        Map<String,Integer> duplicatWithCountCollection = new HashMap<>();
        for (String word: collectionWords) {
            duplicatWithCountCollection.put(word, Collections.frequency(collectionWords, word));
        }
        System.out.println(duplicatWithCountCollection);

    }
}