package StreamApi;

import java.util.Arrays;
import java.util.List;

public class AvgOfNums {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        double avg = list.stream().mapToInt(e -> e).average().orElse(0.0);
        System.out.println("Average is : "+ avg);


        //double avg1 = list.stream().mapToInt(e -> e).average().getAsDouble();
        //here if list is empty then .getAsDouble() throws NoSuchElementException: No value present

        //when we say list.stream() it returns stream of integer objects,
        // and average method is defined for primitive streams (IntStream, DoubleStream, LongStream),
        // not for streams of objects, that's the reason we convert or map to int before average().


    }
}
