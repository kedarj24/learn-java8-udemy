package StreamApi;

import java.util.Arrays;
import java.util.List;

public class MaxMinNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);

        //Maximum Number

        int maxNumber = numbers.stream().max(Integer::compare).get();

        System.out.println("Maximum Number is :" + maxNumber);

        // Minimum Number

        int minNumber = numbers.stream().min(Integer::compare).get();

        System.out.println("Minimum Number is :" + minNumber);


        //max((n1,n2) -> Integer.compare(n1,n2))   this can be written as below
        // max(Integer::compare) also known as method referencing

    }
}
