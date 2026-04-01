package Collection;

import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<String>();

        arr.add("Raja");
        arr.add("Goldy");
        arr.add("Debasish");
        arr.add("Sai Priya");

        for (String s : arr) {
            System.out.println(s);
        }
    }

}
