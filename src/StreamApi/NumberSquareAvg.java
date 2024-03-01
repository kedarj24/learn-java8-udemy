package StreamApi;

import java.util.Arrays;
import java.util.List;

// get the square of number greater than 20
//get the average of those numbers
public class NumberSquareAvg {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        double sumAvg = list.stream()
                .mapToInt(e -> e * e)   // Square each number
                .filter(e -> e > 20)    // Filter numbers greater than 20
                .average()              // Calculate the average
                .orElse(0.0);     // If no elements, default to 0.0

        System.out.println(sumAvg);
    }
}
