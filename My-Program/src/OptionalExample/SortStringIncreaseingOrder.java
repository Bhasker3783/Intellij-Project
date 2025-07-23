package OptionalExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//import java.util.stream.Collectors;

public class SortStringIncreaseingOrder {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Bhasker","Raj","Jay","Rajesh","bhanu"));
        List<String> sortByLargest = list.stream()
                .sorted(Comparator.comparingInt(String::length)
                        .reversed()).toList();
        System.out.println(sortByLargest);
    }
}
