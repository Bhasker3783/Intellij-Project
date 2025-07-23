package StringManipulation;
import java.util.*;
public class FirstNonReaptingCharacter {



        public static void main(String[] args) {
            String input = "teeter";
            Character result = findFirstNonRepeating(input);

            if (result != null)
                System.out.println("First non-repeating character: " + result);
            else
                System.out.println("No unique character found.");
        }

        public static Character findFirstNonRepeating(String str) {
            Map<Character, Integer> countMap = new LinkedHashMap<>();

            for (char ch : str.toCharArray()) {
                countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
            }

            for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
                if (entry.getValue() == 1)
                    return entry.getKey();
            }

            return null;
        }
    }


