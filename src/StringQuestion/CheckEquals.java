package StringQuestion;

public class CheckEquals {
    public static void main(String[] args) {
        String str1 = "Abc";
        String str2 = "abc";
        String str3 = new String("Abc") ;
        String str4 = "abc";

        System.out.println(str1==str2);// == check if reference variable is same !
        System.out.println(str1 == str3);

        System.out.println(str1.equals(str3));// equals method checks the contains
        // are same or not
        System.out.println(str1.equals(str4));
        System.out.println(str1.equalsIgnoreCase(str4));
    }
}
