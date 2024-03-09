package StreamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortedNums {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4,52,12,3,23,19,11,67,4,6,7,44,78,1);


        List<Integer> Acslist =list.stream().sorted().toList();
        System.out.println(Acslist);

        List<Integer> Dcslist =list.stream().sorted(Collections.reverseOrder()).toList();
        System.out.println(Dcslist);
    }
}
