package StreamApi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumRanage {
    public static void main(String[] args) {

        List<Integer> square = IntStream.range(1,11).map(e-> e*e)
                    .boxed()
                    .collect(Collectors.toList());

            System.out.println(square);


            // Just print all num in given range

        List<Integer> range = IntStream.range(1,11)
                    .boxed()
                    .collect(Collectors.toList());

            System.out.println(range);
    }
}
