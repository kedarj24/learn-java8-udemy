package StreamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortedElements {
    public static void main(String[] args) {
        int[] arr = {3, -3, 45, 2, -19, -7, 52, 18};

        List<Integer> sortedNumbers = Arrays.stream(arr)
                .boxed()  // Convert int to Integer
                .sorted()
                .toList();

        System.out.println(sortedNumbers);

        List<Integer> sortedRevNumbers = Arrays.stream(arr)
                .boxed()   // Convert int to Integer
                .sorted(Collections.reverseOrder()) // Sorting in reverse order
                .collect(Collectors.toList());

        System.out.println(sortedRevNumbers);


    }
}
