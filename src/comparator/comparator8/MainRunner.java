package comparator.comparator8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainRunner {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Abb","Sevenit","Amaraja","Suzlon","KPIT","GardenReach","Apar");

        List<String> listString = strings.stream().sorted(Comparator.comparing(String::length)
                .thenComparing(Comparator.naturalOrder())).toList();

        System.out.println(listString);
    }
}
