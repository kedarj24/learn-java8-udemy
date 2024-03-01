package StreamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateNums {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,6,2,1,3,5,8,2,9);

        Set<Integer> duplicate = numbers.stream().filter(e -> Collections.frequency(numbers, e) > 1)
                .collect(Collectors.toSet());

        System.out.println(duplicate);

       // ********************************************************************************************

        List<Integer> non_duplicate = numbers.stream().filter(e -> Collections.frequency(numbers, e) == 1)
                .toList();

        System.out.println(non_duplicate);

        //Collections.frequency(numbers, e): This method call returns the number of
        // occurrences of the element e in the numbers list.
    }
}
