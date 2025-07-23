package OptionalExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondEvenLargest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(122,20,300,44,51,20,74,82,20,10));
        Integer Largest = list.stream().distinct().filter(x->x%2==0)
                .sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println(Largest);
    }
}
