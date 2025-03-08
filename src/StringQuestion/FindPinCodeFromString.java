package StringQuestion;

import static java.lang.Character.isDigit;

public class FindPinCodeFromString {

    public static void main(String[] args) {

        String str = "A/23,Flat no 5,HillCrest Society,Pimple Saudagar,Pune,411061";

        String[] var = str.split(",");

        for (int i = 0; i < var.length; i++) {

            if (var[i].length() == 6 && isAllDigit(var[i])) {
                System.out.println("Pincode is : " + var[i]);
            }
        }

    }

    private static boolean isAllDigit(String s) {
        for (char a : s.toCharArray()) {
            if (isDigit(a)) {
                return true;
            }
        }
        return false;
    }

}
