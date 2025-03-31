package StreamApiAdvance1;


import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//input =
//Count Occurence of each character
public class Code3 {
    public static void main(String[] args) {


        String str ="Hello World";
        // Approach 1 - using Arrays.stream()
        Map<String, Long> occurenceMap = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        // Approach 2 - using str.chars()
        Map<Character, Long> occurrenceMap1 = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(occurenceMap);
        System.out.println(occurrenceMap1);

    }
}
