
import java.util.Scanner;

public class ZD32 {
    public static void main(String[] args) {
        Scanner Scanchik = new Scanner(System.in);
        long n = Scanchik.nextLong();
        boolean sashaTurn = true;
        while (n > 1) {
            if (n % 2 == 0) {
                if (sashaTurn) {
                    n = n / 2;
                } else {
                    n = n - 1;
                      public static void game(long n) {
        int q = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                q++;
                n--;
                if (n == 1) {
                    break;
                } else {
                    n--;
                }

            } else {
                Tanya++;
                n--;
                if (n % 2 == 0) {
                    n /= 2;
                    if (n == 1) {
                        break;
                    }

                }
            }

        }
        System.out.println(q);
    }
}

              

