package StreamApiAdvance1;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

// SummarizingInt
public class Code4 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        IntSummaryStatistics collect = list.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));

        System.out.println(collect.getMax() + " " + collect.getAverage());
    }
}
