package StringQuestion;

public class StringSpacesRemove {
    public static void main(String[] args) {
        String input = "Hello Kedar Jadhav";

        String result = input.replaceAll("\\s", "");

        System.out.println(result);
    }
}
