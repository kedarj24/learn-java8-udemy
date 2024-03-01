package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class NumsStartWith2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(123, 25, 208, 345, 201, 876,-22);

        List<Integer> result = numbers.stream()
                .map(String::valueOf)
                .filter(e -> e.startsWith("2") || e.startsWith("-2"))
                .map(Integer::valueOf)
                .toList();

        System.out.println(result);

        //************* Also different Approach *******************

        List<Integer> result1 = numbers.stream()
                .filter(n -> n.toString().startsWith("2") || n.toString().startsWith("-2"))
                .toList();

        System.out.println(result1);
    }
}
