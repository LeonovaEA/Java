import java.util.Random;
import java.util.Scanner;

public class ZD36 {
    public static void main(String[] args) {
        Scanner Scanchik = new Scanner(System.in);
        Random Randomchik = new Random();
        for (int q = 0; q < 4; q++) {
            secretCode[q] = Randomchik.nextInt(10);
        }

        System.out.println("разгадать код быстрее чем за 20 попыток");

        int attemptsLeft = 20;
        while (attemptsLeft > 0) {
            System.out.println("попыток: " + attemptsLeft);
            System.out.print("Введите 4 числа (от 1 до 9) через enter: ");
            for (int q = 0; q < 4; q++) {
                guess[q] = Scanchik.nextInt();
            }

            int numMatches = 0;
            for (int q = 0; q < 4; q++) {
                if (guess[q] == secretCode[q]) {
                    numMatches++;
                }
            }

            if (numMatches == 4) {
                System.out.println("Вы угадали код!");
                return;
            } else {
                System.out.println("Совпадения: " + numMatches);
            }

            attemptsLeft--;
        }

        System.out.println("попытки закончились");
    }

}
