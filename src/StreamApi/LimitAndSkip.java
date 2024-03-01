package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitAndSkip {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        List<Integer> list = numbers.stream().limit(3).toList();
        System.out.println(list);

        List<Integer> list1 = numbers.stream().skip(7).toList();
        System.out.println(list1);
    }
}
