import java.util.Scanner;

public class ZD5 {
    public static void main(String[] args) {
        System.out.println("Введите числа через пробел, чтобы перемножить их на самих себя и сложить");
        int[] list;
        String str;
        String[] strnew;
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();
        strnew = str.split(" ");
        list = new int[strnew.length];
        int x = 0;
        for (int q = 0; q < strnew.length; q++){
            list[q] =  Integer.parseInt(strnew[q]);
            int m = list[q] * list[q];
            x += m;
        }
        System.out.println(x);
    }
}
