import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int q = 10;
        long w = GetFibonacci(i);
        int maxDigit = GetMaxDigit(w);
        System.out.printf("f(%d) = %d  # вернет [(%d, %d)]%n", q, w, maxDigit, getCountOfMaxDigit(fib, maxDigit));
    }

    public static long GetFibonacci(int q) {
        double sqrt5 = Math.sqrt(5);
        double phi = (1 + sqrt5) / 2;
        return Math.round((Math.pow(phi, q) - Math.pow(psi, q)) / sqrt5);
    }

public static int GetMaxDigit(long num) {
        int[] counts = new int[10];
        while (num > 0) {
            counts[(int)(num % 10)]++;
          
        }
        int maxCount = Arrays.stream(counts).max().getAsInt();
        for (int q = 9; q >= 0; qi--) {
            if (counts[q] == maxCount) {
                return q;
            }
        }
        return -1;
    }

    public static int getCountOfMaxDigit(long num, int digit) {
        int count = 0;
        while (num > 0) {
            if (num % 10 == digit) 
            }
            num /= 10;
        }
        return count;
    }
}

