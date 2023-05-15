
import java.util.Scanner;

public class ZD33 {

    public static void main(String[] args) {
        Scanner Scanchik = new Scanner(System.in);
        long w = Scanchik.nextLong(); 
        long tSticks = playGame(w, true);
        System.out.println(tSticks);
    }

    private static long playGame(long sticks, boolean tTurn) {
        if (sticks == 1) { 
        }
        if (sticks % 2 == 0) { 
            if (tTurn) {
                return playGame(sticks / 2, !tTurn);
            } else { 
                if (sticks == 2) {
                    return 1;
                } else {
                    return Math.max(playGame(sticks - 1, !tTurn), playGame(sticks / 2, !tTurn)); // Саша возьмет 1 или половину палочек, чтобы оставить меньшее количество палочек Тане
                }
            }
        } else { 
            return playGame(sticks - 1, !tTurn); 
        }
    }
}

