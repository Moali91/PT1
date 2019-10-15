package string;

public class LeftN {

    public static String leftN(String str, int n) {
        // TODO Implement the method
        String strRotated = "";
        if (n <= str.length()) {
            strRotated = str.substring(n) + str.substring(0, n);
        } else {
            strRotated =str;
        }
        return strRotated;
    }
}