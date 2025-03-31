package StreamApiAdvance1;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Reverse each word in a sentence:
//Input: "Hello Java" → Output: "olleH avaJ"
public class Code2 {

    public static void main(String[] args) {
        String str = "Hello World";

        String str1 = "123abc456";


       String reversedStr = Arrays.stream(str.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println(reversedStr);

        // Q2 Reverse complete String

        String reversed = IntStream.range(0,str1.length())
                .mapToObj(i -> str1.charAt(str1.length()-1-i))
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(reversed);
    }
}
