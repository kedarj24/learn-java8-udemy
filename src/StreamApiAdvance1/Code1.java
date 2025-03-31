package StreamApiAdvance1;
//converts all lowercase letters to uppercase and all uppercase letters
// to lowercase using Java Streams
//input = hellO Java
//output = HELLo jAVA

import java.util.stream.Collectors;

public class Code1 {
    public static void main(String[] args) {
        String str =  "hellO Java";

        String swappedStr = str.chars().mapToObj(c -> Character.isLowerCase(c) ? Character.toUpperCase((char)c) : Character.toLowerCase((char)c))
                .map(String::valueOf).collect(Collectors.joining());

        System.out.println(swappedStr);
    }

}
