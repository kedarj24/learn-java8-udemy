package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        // Even Numbers as Output

        List<Integer> collect = numbers.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(collect);

        // Odd Numbers as Output

        List<Integer> collectOdd = numbers.stream()
                .filter(e -> e % 2 != 0)
                .collect(Collectors.toList());

        System.out.println(collectOdd);
    }
}
