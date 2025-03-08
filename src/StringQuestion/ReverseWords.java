package StringQuestion;

public class ReverseWords {

    public static String reverseWordsInSentence(String str) {

        String[] var = str.split(" ");

        StringBuilder reverseString = new StringBuilder();

        for (int i = var.length - 1; i >= 0; i--) {

            reverseString.append(var[i]);

            if (i != 0) {
                reverseString.append(" ");
            }
        }

        return reverseString.toString();
    }

    public static void main(String[] args) {
        String newString = "Hello this is my new code";

        System.out.println(reverseWordsInSentence(newString));
    }
}
