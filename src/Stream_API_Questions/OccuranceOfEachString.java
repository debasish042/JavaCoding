package Stream_API_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceOfEachString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Raja","Goldy","Raja","Goldy");

        Map<String,Long> map =list.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map.forEach((String,value)->System.out.println(String+":"+value));
    }
}
