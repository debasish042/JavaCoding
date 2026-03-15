import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0,0,1,2,0,3,0,5);
        List<Integer> list1  = Stream.concat(
                list.stream().filter(x -> x!=0),
                list.stream().filter(x -> x ==0)
        ).collect(Collectors.toList());
        System.out.println(list1);

    }
}
