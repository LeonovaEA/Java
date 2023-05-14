import java.util.Scanner;

public class ZD7 {
    public static void main(String[] args){
        System.out.println("Введите число m");
        Scanner m = new Scanner(System.in);
        int number = m.nextInt();
        System.out.println(Math.round(Math.sqrt(number)));

    }
}
