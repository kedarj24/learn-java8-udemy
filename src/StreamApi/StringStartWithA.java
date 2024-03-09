package StreamApi;

import java.util.Arrays;
import java.util.List;

public class StringStartWithA {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple","Adam","Star","War","Car","Far","Won");

        List<String> collect = list.stream().filter(x -> x.startsWith("A")).toList();
        System.out.println(collect);
    }
}
