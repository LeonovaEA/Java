import java.util.Scanner;

public class ZD16 {
    public static void main(String[] args){
        System.out.println("Введите текст");
        Scanner str = new Scanner(System.in);
        String stroka1 = str.nextLine();
        String[] stroka2 = stroka1.split("");
        int x = 0;
        for(int q = 0; q <  stroka2.length;q++){
            if(stroka2[q].equals(stroka2[q].toUpperCase())) {
                x++;
            }
            if(x > stroka2.length - x) {
                stroka1 = stroka1.toUpperCase();
            } else {
                stroka1 = stroka1.toLowerCase();
            }
        }
        System.out.println(stroka1);
    }
}

