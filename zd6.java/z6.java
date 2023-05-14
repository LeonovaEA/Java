import java.util.Scanner;
public class ZD6 {
    public static void main(String[] args){
        boolean count = number(2578);
        System.out.println(count);
    }
    public static boolean number(int x){
        int q = 2;
        while (x % q != 0){
            q++;
        }
        if (q == x){
            return true;
        }
        return false;
    }

}
