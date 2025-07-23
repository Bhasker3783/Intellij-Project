package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class LargestElement {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(Arrays.asList(12,22,6,2,3));
        System.out.println(set);
        ArrayList<Integer> list = new ArrayList<>(set);
        //list.get(list.size())
        System.out.println("Second highest:"+list.get(list.size()-2));


    }
}
