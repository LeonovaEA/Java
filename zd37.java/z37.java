import java.util.List;
import java.util.Scanner;

public class ZD37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("количество игроков: ");
        int q = scanner.nextInt();
        System.out.print("номер игрока (которого начинает игрy): ");
        int start = scanner.nextInt();

        List<Integer> participants = new ArrayList<>();
        for (int l = 1; l <= q; l++) {
            participants.add(l);
        }
        List<Integer> result = new ArrayList<>();
        int count = 0;
        int index = start - 1;

        while (participants.size() > 1) {
            count++;
            index = (index + count) % participants.size();
                result.add(participants.remove(index));
                index--;
            }
        }

        result.addAll(participants);
        System.out.println(result);
    }

}
