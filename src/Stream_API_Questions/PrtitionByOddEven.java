package Stream_API_Questions;
import java.util.*;
import java.util.stream.Collectors;

public class PrtitionByOddEven {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8);

        Map<Boolean,List<Integer>> map = list1.stream()
                .collect(Collectors.groupingBy(x -> x % 2 == 0));

        System.out.println("Even numbers are"+map.get(true));
        System.out.println("Odd numbers are"+map.get(false));
    }

}
