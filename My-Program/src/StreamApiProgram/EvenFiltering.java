package StreamApiProgram;

import java.util.List;
import java.util.stream.Collectors;

public class EvenFiltering {
    public static void main(String[] args) {
        List<Integer> ls = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> even = ls.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(even);
    }
}
