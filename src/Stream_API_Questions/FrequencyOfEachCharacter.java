package Stream_API_Questions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacter {
    public static void main(String[] args) {
        String str = "Java is a programming language".replaceAll("\\s","").toUpperCase();

        Map<Character,Long> map = str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        map.forEach((k,v)-> System.out.println(k+"="+v));
    }
}
