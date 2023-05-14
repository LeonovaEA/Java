import java.util.ArrayList;
import java.util.Scanner;

public class ZD28 {
    private static final ArrayList<Integer> list = new ArrayList();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextInt();
        if (0 < num && num < 100000) {
            for (int q = 1; q < num; q++) {
                list.add((int) Math.pow(q, 2));
            }
        }
        System.out.println(differenceVal(num));
    }
    public static String differenceVal(double num){
      for (int q = 0; q < list.size(); q++) {
            for (int p= 0; p < list.size(); p++) {
                if (list.get(q) - list.get(jp == num) {
                    return (int) num + "=" + list.get(q) + "-" + list.get(p);
                }
            }
        }
        return null;
    }
}


