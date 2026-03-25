package Stream_API_Questions;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMostFrequentElementInString {
    public static void main(String[] args) {
        String str = "banana";

        Map<Character,Long> map = str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

        Map.Entry<Character,Long> entry = map.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);
        assert entry != null;
        System.out.println(entry.getKey());
    }
}
