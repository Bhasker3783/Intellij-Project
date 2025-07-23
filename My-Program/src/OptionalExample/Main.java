package OptionalExample;

import java.util.Arrays;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
       Person person = new Person(null,"Bhasker3783@gmail.com", Arrays.asList("sing", "Dance"));
       /*We are trying to access name of person using Optional.of and storing in optionalName of optional container
        of string type.
        It Will return for value if its there return vaule otherwise NPE.

        */

        Optional<String> optionalName = Optional.of(person.getName());
       System.out.println(optionalName);

        //now using Optional.ofNullable which return value if persent otherwise empty optional

//        Optional<String> optionalName1 = Optional.ofNullable(person.getName());
//        System.out.println(optionalName1.orElse("DefaultName"));
    }
}
