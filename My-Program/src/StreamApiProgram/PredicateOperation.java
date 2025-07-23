package StreamApiProgram;

import java.util.List;
import java.util.stream.Collectors;

public class PredicateOperation {

    public static void main(String[] args) {

        List<String> name = List.of("Bhasker","Bhanu","Shikha","rahul");
        List<String> user = name.stream().filter(x->x.length()>5).collect(Collectors.toList());
        System.out.println(user);
    }
}
