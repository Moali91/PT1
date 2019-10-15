package array;

public class MostFrequentDigit {

    public static int getMostFrequentDigit(String digitString) {
        // TODO Implement the method
        int digits[] = new int[10];

        for (int i = 0; i < digitString.length(); i++) {
            int j = digitString.charAt(i) - 48;
            digits[j]++;
        }
        int digit = 0;
        int count = digits[0];
        for (int i = 1; i < 10; i++) {
            if (digits[i] > count) {
                count = digits[i];
                digit = i;
            }
        }
        System.out.println("digit = " + digit + "  count= " + count);
        return digit;
    }
}
