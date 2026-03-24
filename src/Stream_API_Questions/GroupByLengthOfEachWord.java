package Stream_API_Questions;

import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class GroupByLengthOfEachWord {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Raja","Goldy","Debasish","Glory");

        Map<Integer,List<String>> map = list.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(map);
    }
}
