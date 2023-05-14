import java.util.Scanner;

public class ZD9 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String stroka1 = x.nextLine();
        String stroka2 = x.nextLine();
        boolean str = stroka1.endsWith(stroka2);
        System.out.println(str);
    }
}
