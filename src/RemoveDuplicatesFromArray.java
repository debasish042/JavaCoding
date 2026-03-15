import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,4,3,5);

        Set<Integer> set = new HashSet<>();

        Set<Integer> set1 = list.stream()
                        .filter(x->!set.add(x))
                                .collect(Collectors.toSet());
        System.out.println(set1);
    }
}
