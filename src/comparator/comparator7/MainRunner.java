package comparator.comparator7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainRunner {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Abb","Amaraja","Suzlon","KPIT","GardenReach","Apar");

        List<String> listString = strings.stream().sorted(Comparator.comparingInt(String::length)
                .reversed()).toList();

        System.out.println(listString);
    }
}
