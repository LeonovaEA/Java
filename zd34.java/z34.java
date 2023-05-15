import java.util.Arrays;
import java.util.Comparator;

public class ZD34 {
    public static void main(String[] args) {
        String input = "56 54 88 100 91 68 43 180 70";
        String[] weights = input.split(" ");
        Arrays.sort(weights, Comparator.comparingInt(ZD34::sumOfDigits).reversed());
        System.out.println(String.join(" ", weights));
    }
        int sum = 0;
        for (int q = 0; q < number.length(); q++) {
            sum += Character.getNumericValue(number.charAt(q));
        }
        return sum;
    }

}




