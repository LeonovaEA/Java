import java.util.Arrays;

public class ZD26 {
    public static void main(String[] args) {
        String palindr = palindrString("abbbcac");
        System.out.println(palindr + "\n" + palindr.length());
    }
    public static String palindr(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return str.substring(left + 1, right);
    }
    public static String palindrString(String str) {
        String longest = str.substring(0, 1);
        for (int q = 0; q < str.length() - 1; q++) {
            if (palindr(str, q, q).length() > longest.length()) {
                longest = palindr(str, q, q);
            }
            if (palindr(str, q, q + 1).length() > longest.length()) {
                longest = palindr(str, q, q + 1);
            }
        }
        return longest;
    }
}

