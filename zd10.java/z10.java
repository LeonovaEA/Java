import java.util.Scanner;

public class ZD10 {
    public static void main(String[] args){
        System.out.println("Введите имя");
        Scanner stroka = new Scanner(System.in);
        String stroka1 = stroka.nextLine();
        String stroka2 = stroka1.toLowerCase();// все буквы маленькими
        String stroka3 = stroka2.substring(0,1).toUpperCase() + stroka2.substring(1);//1 Букву большой, прибавляем слово без 1й буквы
        System.out.println("Привет, " + stroka3 + "!");
    }
}
