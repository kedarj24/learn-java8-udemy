package StreamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumber {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(9, 4, 2, 6, 8, 2, 1, 14, 3, 25);

        int secondHighest = list.stream()
                .sorted(Comparator.reverseOrder())  // Sorting in reverse order
                .limit(2)                   // Limit to the first two elements
                .skip(1)                         // Skip the first element
                .findFirst()                        // Find the first element in the remaining stream
                .orElseThrow();                     // Throw an exception if not found

        System.out.println(secondHighest);
    }
}
